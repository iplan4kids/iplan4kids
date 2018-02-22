package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;

import java.util.List;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
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
