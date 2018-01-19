package gr.ntua.ece.softeng17b.controller;

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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public String redirect() {
	      return "redirect:pages/index.html";
	   }
	
	/*@RequestMapping(value="/login" , method=RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView model1 = new ModelAndView("AdmissionForm");
		return model1;
	}*/
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @RequestParam("username") String username, @RequestParam("password") String password, ServletRequest req) {

		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		HttpServletRequest request = (HttpServletRequest) req;
		Cookie cookieUsername = new Cookie("cookieLoginUser", username);
		Cookie cookiePassword = new Cookie("cookieLoginPassword", password);
		cookieUsername.setMaxAge(60 * 60 * 24 * 365);
		cookiePassword.setMaxAge(60 * 60 * 24 * 365);
		//System.console().writer().println(request.getContextPath());
		model1.addObject("cookie1", cookieUsername);
		model1.addObject("cookie2", cookiePassword);
		//model1.addObject("msg","You have logged in with username " + username + " and pass " + password);
		return model1;
	}

	@RequestMapping(value="/register", method = RequestMethod.POST)
	public ModelAndView registerForm(@ModelAttribute("client1") Client client1){
		
	
}
