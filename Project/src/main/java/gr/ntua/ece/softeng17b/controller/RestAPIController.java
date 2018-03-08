package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;
import gr.ntua.ece.softeng17b.RESTrepresentations.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPIController {





/*--------------------------------------------------------------------	Client Login	------------------------------------------ */
	
	@RequestMapping(value = "/loginClient", method = RequestMethod.POST)
	public RESTclass submitAdmissionForm(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest req) {
		
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
        EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();

		try {
			Optional<Client> optional = dbAccess.getClientByUsername(username);
			Client c = optional.orElseThrow(() -> new Exception("User Not Found"));
			if(c.isBlocked()){
				throw new Exception("Client blocked");
			}
			if(encrypter.encryptMatch(password,c.getPassword())) {
                HttpSession session = req.getSession();
				session.setMaxInactiveInterval(3*60*60);
				session.setAttribute("client", c);
				return new RESTclass(true, c.getUsername() , c.getWallet());
            }
            else throw new Exception("Wrong password");
		}
		catch (Exception e){
			return new RESTclass(false , e.getMessage() , 0 );
		}
	}



/*--------------------------------------------------------------------	Admin/Provider Login	------------------------------------------ */
	//produces={"text/html; charset=UTF-8"}
	@RequestMapping(value = "/login/{type}", method = RequestMethod.POST)
	public boolean submitAdmissionForm(@RequestParam("username") String username, @RequestParam("password") String password, @PathVariable("type") String loginType, HttpServletRequest req) {

	    DataAccess dbAccess = Configuration.getInstance().getDataAccess();
        EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();
	    try {
			if (loginType.equals("provider")){
				Optional<Provider> optional = dbAccess.getProviderByUsername(username);
				Provider p = optional.orElseThrow(() -> new Exception("User Not Found"));
				if(p.isBlocked()){
					throw new Exception("Provider blocked");
				}
				if(encrypter.encryptMatch(password,p.getPassword())) {                
                	HttpSession session = req.getSession();
					session.setMaxInactiveInterval(3*60*60);
					session.setAttribute("provider", p);
                	return true;
            	}	
            	else throw new Exception("Wrong password " + encrypter.encryptPass(password));
			}
			else{
				Optional<Admin> optional = dbAccess.getAdminByUsername(username);
				Admin a = optional.orElseThrow(() -> new Exception("User Not Found"));
				if(encrypter.encryptMatch(password,a.getPassword())) {                
                	HttpSession session = req.getSession();
					session.setMaxInactiveInterval(3*60*60);
					session.setAttribute("admin", a);
                	return true;
				}
				else throw new Exception("Wrong password");
			}
		}
		catch (Exception e){
	    	System.out.println(e.getMessage());
			return false;
		}
	}

//---------------------------Events-----------------------------------------------//


	@RequestMapping(value = "/events/getEvents", method = RequestMethod.POST)
	public List<Event> getEvents(@RequestParam ("searchtext") String text, HttpServletRequest req){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		if(text.equals("")) {

			return new ArrayList<Event>(){};
		}
		else{
			List <Event> events = dbAccess.freeTextSearch(text);
			return events;
		}
	}

	@RequestMapping(value = "/events/byFiltersEvents", method = RequestMethod.POST,consumes = {"application/json"})
	public List<Event> getEventsByFilters(@RequestBody Filters filters, HttpServletRequest req) throws Exception {
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		HttpSession session = req.getSession(true);
		String tags = "";
		String[] arrayTags = {"Αθλητισμός", "Θέατρο", "Μουσική", "Εργαστήρι", "Άλλες"};
		for (String i : filters.getCategories()) {
			tags += arrayTags[Integer.parseInt(i) - 1] + " , ";
		}
		if(tags.equals("")) tags = null;
		if(filters.getNumberOfKm() == 0) filters.setNumberOfKm(null);
		System.out.println(filters.getFindAddr());
		System.out.println(filters.getNumberOfKm());
		System.out.println(filters.getMax());
		if (filters.getFindAddr() == 0) {
			if (session.getAttribute("client") == null) throw new Exception("Not logged in...");
			else {
				Client cl = (Client) session.getAttribute("client");
				System.out.println(cl.getLatitude());
				System.out.println(cl.getLongtitude());
				List<Event> events = dbAccess.searchByFilters( tags, filters.getMin(), filters.getMax(), filters.getNumberOfKm(), new SimpleLocation(cl.getLatitude(), cl.getLongtitude()), 0, 48);
				return events;
			}
		}
		else {
			List<Event> events = dbAccess.searchByFilters( tags, filters.getMin(), filters.getMax(), filters.getNumberOfKm(), new SimpleLocation(filters.getLat(), filters.getLng()), 0, 48);
			return events;
		}
	}


//------------------------------------------------------------------------------//
	
	@RequestMapping(value = "/admin/clients", method = RequestMethod.GET)
	public List<Client> getClients(){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		return dbAccess.getAllClients();
	}

	@RequestMapping(value = "/admin/providers", method = RequestMethod.GET)
	public List<Provider> getProviders(){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		return dbAccess.getAllProviders();
	}


	
	/*@RequestMapping(value = "/events/getAllEvents", method = RequestMethod.GET)
	public List<Event> getEvents(){
		
	}
	*/



	@RequestMapping(value = "/buyPoints/buy", method = RequestMethod.POST)
	public RESTclass getPoints(@RequestParam("money") double money, HttpServletRequest req){
		HttpSession session = req.getSession(false);
		Client c = (Client) session.getAttribute("client");
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();

		try {
			double new_money = dbAccess.addWallet(c.getId(), money);
			c.setWallet(new_money);
			return new RESTclass(true, c.getUsername() , c.getWallet());
		}
		catch(Exception e){
			System.out.print(e.getMessage());
			return new RESTclass(false , e.getMessage() , 0 );
		}
	}

	@RequestMapping(value = "/provider/buySub/renew", method = RequestMethod.POST)
	public boolean buyYourSub(@RequestParam ("amount") int subMonths, HttpServletRequest req) {
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		HttpSession session = req.getSession(false);

		Provider prov = (Provider) session.getAttribute("provider");
		try {
			Timestamp nsub = dbAccess.renewSub(subMonths, prov.getId());
			prov.setSubscription(nsub);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}



	@RequestMapping(value = "/provider/history", method = RequestMethod.GET)
	public List<Event> getHistory(HttpServletRequest req){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		HttpSession session = req.getSession(false);
		Provider prov = (Provider) session.getAttribute("provider");
		return dbAccess.getAllEventsByProvider(prov.getId());
	}
	
	
}
