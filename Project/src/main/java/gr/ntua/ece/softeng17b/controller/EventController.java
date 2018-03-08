package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
@RequestMapping(value = "/events")
public class EventController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getEvents(HttpServletRequest req) {
		ModelAndView model1 = new ModelAndView("allEvents");
		HttpSession session = req.getSession(true);
		String text = (String) req.getParameter("searchtext");
		System.out.println(text);
		session.setAttribute("fromSearch",text);
		return model1;
	}


	
	
	@RequestMapping(value = "/event/{id}", method = RequestMethod.GET)
	public ModelAndView getEvent(HttpServletRequest req, @PathVariable("id") long eventId) {
		ModelAndView model1 = null;
		HttpSession session = req.getSession(false);
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		try {
			Optional<Event> optional = dbAccess.getEventById(eventId);
			Event ev = optional.orElseThrow(() -> new Exception("Event Not Found"));
			model1 = new ModelAndView("eventPage");
			session.setAttribute("event",ev);
			model1.addObject("event", ev);

			Optional<Provider> optional2 = dbAccess.getProvider(ev.getProv_id());
			Provider prov = optional2.orElseThrow(() -> new Exception("Provider Not Found"));
			model1.addObject("prov", prov);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			model1 = new ModelAndView("redirect");
		}
		finally{ return model1;}
	}
	
	
}
