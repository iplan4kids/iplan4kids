package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;
import gr.ntua.ece.softeng17b.RESTrepresentations.*;

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
			return new RESTclass(false , e.getMessage() , 1.5 );
		}
	}



/*--------------------------------------------------------------------	Admin/Provider Login	------------------------------------------ */
	
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
            	else throw new Exception("Wrong password");
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
			return false;
		}
	}








	
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

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public void logout(HttpServletRequest req){
		HttpSession session = req.getSession(false);
		session.invalidate();
	}
	
	/*@RequestMapping(value = "/events/getAllEvents", method = RequestMethod.GET)
	public List<Event> getEvents(){
		
	}
	*/
	
	/*@RequestMapping(value = "/buyPoints/{number}", method = RequestMethod.PUT)
	public boolean buyYourPoints(@PathVariable ("number") int points) {
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		//enhmerwsh ths vashs
	}
	
	@RequestMapping(value = "/provider/buySub/{sub}", method = RequestMethod.PUT)
	public boolean buyYourSub(@PathVariable ("sub") int subMonths) {
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		//enhmerwsh ths vashs
	}*/
	
	
}
