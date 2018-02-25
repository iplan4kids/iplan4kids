package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;
import gr.ntua.ece.softeng17b.RESTrepresentations.*;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class AppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView redirect() {

		ModelAndView model1 = new ModelAndView("index");
		return model1;
	}
	
	
	@RequestMapping(value = "/loginClient", method = RequestMethod.POST)
	@ResponseBody
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
	
	@RequestMapping(value = "/login/{type}", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("username") String username, @RequestParam("password") String password, @PathVariable("type") String loginType,
			HttpServletRequest req) {

	    DataAccess dbAccess = Configuration.getInstance().getDataAccess();
        EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();

		ModelAndView model1 = new ModelAndView("AdmissionSuccess");

	    try {
			if (loginType.equals("provider")){
				Optional<Provider> optional = dbAccess.getProviderByUsername(username);
				Provider p = optional.orElseThrow(() -> new Exception("User Not Found"));
				if(encrypter.encryptMatch(password,p.getPassword())) {                
                	HttpSession session = req.getSession();
					session.setMaxInactiveInterval(3*60*60);
					session.setAttribute("provider", p);
                	model1.addObject("cookie1", p.getUsername());
                	model1.addObject("cookie2", p.getPassword());
					model1.addObject("message", "    and logged in with type:" + loginType);
                	return model1;
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
                	model1.addObject("cookie1", a.getUsername());
                	model1.addObject("cookie2", a.getPassword());
					model1.addObject("message", "    and logged in with type:" + loginType);
                	return model1;
				}
				else throw new Exception("Wrong password");
			}
		}
		catch (Exception e){
			model1.addObject("cookie1", e.getMessage());
			model1.addObject("cookie2", e.getMessage());
			model1.addObject("message", loginType);
			return model1;
		}

	}

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView redirectToReg() {
			ModelAndView model1 = new ModelAndView("register");
        return model1;
    }

	@RequestMapping(value = "/registerClient", method = RequestMethod.POST)
	public ModelAndView registerForm(@ModelAttribute("client1") Client client1) {

        DataAccess dbAccess = Configuration.getInstance().getDataAccess();
        EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();

        client1.setPassword(encrypter.encryptPass(client1.getPassword()));
        dbAccess.createClient(client1);

		ModelAndView model1 = new ModelAndView("index");
		return model1;
	}

	@RequestMapping(value = "/registerProvider", method = RequestMethod.POST)
	public ModelAndView registerForm(@ModelAttribute("provider1") Provider provider1) {

		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();

		provider1.setPassword(encrypter.encryptPass(provider1.getPassword()));
		dbAccess.createProvider(provider1);

		ModelAndView model1 = new ModelAndView("index");
		return model1;
	}
	
	
	@RequestMapping(value = "/further", method = RequestMethod.GET)
	public ModelAndView getfurther(HttpServletRequest req) {
		ModelAndView model1 = new ModelAndView("further");
		HttpSession session = req.getSession(false);
		if (session==null){
			HttpSession session1 = req.getSession();
			session1.setAttribute("name", false);
		}
		else 	session.setAttribute("name", true);
		return model1;
	}
	
	@RequestMapping(value = "/myProfile", method = RequestMethod.GET)
	public ModelAndView getProfile(HttpServletRequest req) {
		ModelAndView model1 = new ModelAndView("clientProfile");
		HttpSession session = req.getSession(false);
		Client c = (Client) session.getAttribute("client");
		model1.addObject("client1",c);
		return model1;
	}
	
	@RequestMapping(value = "/buyPoints", method = RequestMethod.GET)
	public String getbuyPoints() {
		return "redirect:pages/buyPoints.html";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAdminPage() {
		return "redirect:pages/adminPage.html";
	}
}
