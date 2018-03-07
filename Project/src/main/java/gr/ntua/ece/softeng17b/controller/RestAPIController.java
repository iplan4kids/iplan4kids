package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;
import gr.ntua.ece.softeng17b.RESTrepresentations.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

			return dbAccess.getAllEvents();
		}
		else{
			List <Event> events = dbAccess.freeTextSearch(text);
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


	/*-----------------------------------------------------------------------  Search with bar -------------------------------------*/

	/*@RequestMapping(value = "/searchEvents", method = RequestMethod.GET)
	public List<Event> getSearchedEvents(@RequestParam ("searchtext") String text, HttpServletRequest req) {
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		List <Event> events = dbAccess.freeTextSearch(text);
		return events;
 	}*/
	
	
}
