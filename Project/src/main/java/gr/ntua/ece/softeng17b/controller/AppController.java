package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest req) {
		HttpSession session = req.getSession();
		ModelAndView model1;
		if (session.getAttribute("provider") != null || session.getAttribute("admin") != null)
			model1 = new ModelAndView("redirect");
		else
			model1 = new ModelAndView("index");
		return model1;
	}
	





/*--------------------------------------------------------------------	Admin/Provide Logout	------------------------------------------ */

	@RequestMapping(value = "/logoutStrong", method = RequestMethod.GET)
	public String logout(HttpServletRequest req){
		HttpSession session = req.getSession(false);
		session.invalidate();
        return "redirect:/";
	}



/*--------------------------------------------------------------------	Register	------------------------------------------ */

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView redirectToReg() {
		ModelAndView model1 = new ModelAndView("register");
        return model1;
    }




/*--------------------------------------------------------------------	Create Client	------------------------------------------ */

	@RequestMapping(value = "/registerClient", method = RequestMethod.POST)
	public ModelAndView registerForm(@ModelAttribute("client1") Client client1) {

        DataAccess dbAccess = Configuration.getInstance().getDataAccess();
        EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();

        client1.setPassword(encrypter.encryptPass(client1.getPassword()));
        dbAccess.createClient(client1);

		ModelAndView model1 = new ModelAndView("index");
		return model1;
	}




/*--------------------------------------------------------------------	Create Provider 	------------------------------------------ */

	@RequestMapping(value = "/registerProvider", method = RequestMethod.POST)
	public ModelAndView registerForm(@ModelAttribute("provider1") Provider provider1) {

		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();

		provider1.setPassword(encrypter.encryptPass(provider1.getPassword()));
		dbAccess.createProvider(provider1);

		ModelAndView model1 = new ModelAndView("index");
		return model1;
	}
	



	
	/*@RequestMapping(value = "/further", method = RequestMethod.GET)
	public ModelAndView getfurther(HttpServletRequest req) {
		ModelAndView model1 = new ModelAndView("further");
		HttpSession session = req.getSession(false);
		if (session==null){
			HttpSession session1 = req.getSession();
			session1.setAttribute("name", false);
		}
		else 	session.setAttribute("name", true);
		return model1;
	}*/



/*--------------------------------------------------------------------	Client Profile 	------------------------------------------ */
	
	@RequestMapping(value = "/myProfile", method = RequestMethod.GET)
	public ModelAndView getProfile(HttpServletRequest req) {
		ModelAndView model1;
		HttpSession session = req.getSession();
		if (session.getAttribute("client") != null)
			model1 = new ModelAndView("clientProfile");
		else
			model1 = new ModelAndView("redirect");
		return model1;
	}



/*--------------------------------------------------------------------	Buy Points	------------------------------------------ */

	@RequestMapping(value = "/buyPoints", method = RequestMethod.GET)
	public ModelAndView getbuyPoints(HttpServletRequest req) {
		ModelAndView model1;
		HttpSession session = req.getSession();
		if (session.getAttribute("client") != null)
			model1 = new ModelAndView("buyPoints");
		else
			model1 = new ModelAndView("redirect");
		return model1;
	}



/*--------------------------------------------------------------------	Admin Page 	------------------------------------------ */
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView getAdminPage() {
		ModelAndView model1 = new ModelAndView("adminPage");
		return model1;
	}



	@RequestMapping(value = "/admin/clients/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteClient(@PathVariable("id") long clientId){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		dbAccess.deleteClient(clientId);
		ModelAndView model1 = new ModelAndView("adminPage");
		return model1;
	}

	@RequestMapping(value = "/admin/providers/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteProvider(@PathVariable("id") long providerId){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		dbAccess.deleteProvider(providerId);
		ModelAndView model1 = new ModelAndView("adminPage");
		return model1;
	}

	@RequestMapping(value = "/admin/clients/block/{id}", method = RequestMethod.GET)
	public ModelAndView blocClient(@PathVariable("id") long clientId){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		dbAccess.blockClient(clientId);
		ModelAndView model1 = new ModelAndView("adminPage");
		return model1;
	}

	@RequestMapping(value = "/admin/providers/block/{id}", method = RequestMethod.GET)
	public ModelAndView blockProvider(@PathVariable("id") long providerId){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		dbAccess.blockProvider(providerId);
		ModelAndView model1 = new ModelAndView("adminPage");
		return model1;
	}

	@RequestMapping(value = "/admin/clients/enable/{id}", method = RequestMethod.GET)
	public ModelAndView enableClient(@PathVariable("id") long clientId){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		dbAccess.unblockClient(clientId);
		ModelAndView model1 = new ModelAndView("adminPage");
		return model1;
	}

	@RequestMapping(value = "/admin/providers/enable/{id}", method = RequestMethod.GET)
	public ModelAndView enableProvider(@PathVariable("id") long providerId){
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();
		dbAccess.unblockProvider(providerId);
		ModelAndView model1 = new ModelAndView("adminPage");
		return model1;
	}

}


