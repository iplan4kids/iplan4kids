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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
@RequestMapping(value = "/events")
public class EventController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getEvents(HttpServletRequest req) {
		ModelAndView model1 = new ModelAndView("allEvents");
		HttpSession session = req.getSession(false);
		/*if (session == null)
			model1.addObject("loggedIn", false);
		else
			model1.addObject("loggedIn", true);*/
		return model1;
	}


	
	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public String getEvent(HttpServletRequest req) {
		ModelAndView model1 = new ModelAndView("events");
		HttpSession session = req.getSession(false);
		if (session == null)
			model1.addObject("loggedIn", false);
		else
			model1.addObject("loggedIn", true);
		return "redirect:pages/eventPage.html";
	}
	
	
}
