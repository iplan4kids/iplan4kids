package gr.ntua.ece.softeng17b.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("client")
@RequestMapping(value = "/provider")
public class ProvController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest req) {
        ModelAndView model1;
        HttpSession session = req.getSession(false);
        if (session==null)
            model1 = new ModelAndView("index");
        else{
            if (session.getAttribute("provider") != null)
                model1 = new ModelAndView("provWelcome");
            else
                model1 = new ModelAndView("redirect");
        }
		return model1;
	}
	
	
	@RequestMapping(value = "/addEvent", method = RequestMethod.GET)
	public ModelAndView getAddEvent(HttpServletRequest req) {
        ModelAndView model1;
        HttpSession session = req.getSession(false);
        if (session==null)
            model1 = new ModelAndView("index");
        else{
            if (session.getAttribute("provider") != null)
                model1 = new ModelAndView("addEvent");
            else
                model1 = new ModelAndView("redirect");
        }
        return model1;
	}
	
	
	@RequestMapping(value = "/myProfile", method = RequestMethod.GET)
	public ModelAndView getProfile(HttpServletRequest req) {
        ModelAndView model1;
        HttpSession session = req.getSession(false);
        if (session==null)
            model1 = new ModelAndView("index");
        else{
            if (session.getAttribute("provider") != null)
                model1 = new ModelAndView("providerProfile");
            else
                model1 = new ModelAndView("redirect");
        }
        return model1;
	}
	
	@RequestMapping(value = "/buySub", method = RequestMethod.GET)
	public ModelAndView getBuySub(HttpServletRequest req) {
        ModelAndView model1;
        HttpSession session = req.getSession(false);
        if (session==null)
            model1 = new ModelAndView("index");
        else{
            if (session.getAttribute("provider") != null)
                model1 = new ModelAndView("buySub");
            else
                model1 = new ModelAndView("redirect");
        }
        return model1;
	}
}
