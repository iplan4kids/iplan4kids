package gr.ntua.ece.softeng17b.controller;

import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		ModelAndView model1;
		if (session==null)
			model1 = new ModelAndView("index");
		else {
			if (session.getAttribute("provider") != null || session.getAttribute("admin") != null)
				model1 = new ModelAndView("redirect");
			else
				model1 = new ModelAndView("index");
		}
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



/*--------------------------------------------------------------------	Client Profile 	------------------------------------------ */
	
	@RequestMapping(value = "/myProfile", method = RequestMethod.GET)
	public ModelAndView getProfile(HttpServletRequest req) {
		ModelAndView model1;
		HttpSession session = req.getSession(false);
		if (session==null)
			model1 = new ModelAndView("index");
		else {
			if (session.getAttribute("client") != null)
			model1 = new ModelAndView("clientProfile");
		else
			model1 = new ModelAndView("redirect");
		}
		return model1;
	}



/*--------------------------------------------------------------------	Buy Points	------------------------------------------ */
	
	@RequestMapping(value = "/buyPoints", method = RequestMethod.GET)
	public ModelAndView getbuyPoints(HttpServletRequest req) {
		ModelAndView model1;
		HttpSession session = req.getSession(false);
		if (session==null)
			model1 = new ModelAndView("index");
		else{		
			if (session.getAttribute("client") != null)
				model1 = new ModelAndView("buyPoints");
			else
				model1 = new ModelAndView("redirect");
		}
		Client c = (Client) session.getAttribute("client");
		model1.addObject("client1",c);
		return model1;
	}




	@RequestMapping(value = "/Points", method = RequestMethod.POST)
	public ModelAndView getPoints(@RequestParam("money") double money,HttpServletRequest req) throws Exception{
		ModelAndView model1 = new ModelAndView("buyPoints");
		HttpSession session = req.getSession(false);
		Client c = (Client) session.getAttribute("client");
		DataAccess dbAccess = Configuration.getInstance().getDataAccess();

		//try {
			double new_money = dbAccess.addWallet(c.getId(),money);
			c.setWallet(new_money);
			model1.addObject("client1", c);
			return model1;
		//}
		//catch(Exception e){System.out.print(e.getMessage());}
	}



/*--------------------------------------------------------------------	Admin Page 	------------------------------------------ */
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAdminPage() {
		return "redirect:pages/adminPage.html";
	}
}
