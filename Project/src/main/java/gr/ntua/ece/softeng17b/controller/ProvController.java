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
@SessionAttributes("client")
@RequestMapping(value = "/provider")
public class ProvController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "redirect:../pages/provWelcome.html";
	}
	
	
	@RequestMapping(value = "/addEvent", method = RequestMethod.GET)
	public String getAddEvent() {
		return "redirect:pages/addEvent.html";
	}
	
	
	@RequestMapping(value = "/myProfile", method = RequestMethod.GET)
	public String getProfile() {
		return "redirect:pages/providerProfile.html";
	}
	
	
	@RequestMapping(value = "/buySub", method = RequestMethod.GET)
	public String getBuySub() {
		return "redirect:pages/buySub.html";
	}
}
