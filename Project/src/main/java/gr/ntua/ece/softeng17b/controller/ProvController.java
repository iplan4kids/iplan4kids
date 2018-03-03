package gr.ntua.ece.softeng17b.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import gr.ntua.ece.softeng17b.conf.Configuration;
import gr.ntua.ece.softeng17b.data.DataAccess;
import gr.ntua.ece.softeng17b.data.Event;
import gr.ntua.ece.softeng17b.data.Place;
import gr.ntua.ece.softeng17b.data.Provider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;

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
                model1 = new ModelAndView("providerAddEvent");
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


    @RequestMapping(value = "/addEvent/add", method = RequestMethod.POST)
    public ModelAndView add(HttpServletRequest req) {
        ModelAndView model1;
        DataAccess db = Configuration.getInstance().getDataAccess();
        HttpSession session = req.getSession(false);

        if (session==null)
            model1 = new ModelAndView("index");
        else{
            if (session.getAttribute("provider") != null)
                model1 = new ModelAndView("providerAddEvent");
            else
                model1 = new ModelAndView("redirect");
        }

        Provider prov = (Provider)session.getAttribute("provider");

        String time = req.getParameter("time");
        if(time.length()<=4) time = "0"+time;
        time += ":00";
        String date = req.getParameter("date") + " " + time;
        String[] arrayTags = {"sports","theatre","music","workshop","other"};
        int[] numTags = {
                Integer.parseInt(req.getParameter("sports")),
                Integer.parseInt(req.getParameter("theatre")),
                Integer.parseInt(req.getParameter("music")),
                Integer.parseInt(req.getParameter("workshop")),
                Integer.parseInt(req.getParameter("other")),
        };
        String tags = "";
        for(int i=0 ; i<5 ; i++){
            if(numTags[i]==1) tags += arrayTags[i]+" , ";
        }
        Place pl = new Place(prov.getId(), req.getParameter("title"),"",Double.parseDouble(req.getParameter("lat")),Double.parseDouble(req.getParameter("lng")));

        Event ne = new Event();
        ne.setPlace(pl);
        ne.setTitle(req.getParameter("title"));
        ne.setProv_id(prov.getId());
        ne.setPrice(Double.parseDouble(req.getParameter("price")));
        ne.setTickets(Integer.parseInt(req.getParameter("tickets")));
        ne.setTags(tags);
        ne.setDate(Timestamp.valueOf(date));
        ne.setDescription(req.getParameter("description"));
        ne.setDuration(Integer.parseInt(req.getParameter("duration")));

        db.createEvent(ne);

        return model1;
    }
}


