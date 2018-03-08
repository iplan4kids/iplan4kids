package gr.ntua.ece.softeng17b.controller;

import com.iplan.watermark.Watermark;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.io.*;
import java.util.Optional;


@Controller
@RequestMapping(value = "/provider")
public class ProvController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest req) {
        ModelAndView model1;
         HttpSession session = req.getSession();
        if (session.getAttribute("provider") != null)
        	model1 = new ModelAndView("provWelcome");
        else
            model1 = new ModelAndView("redirect");
        return model1;
	}
	
	
	@RequestMapping(value = "/addEvent", method = RequestMethod.GET)
	public ModelAndView getAddEvent(HttpServletRequest req) {
        ModelAndView model1;
        HttpSession session = req.getSession();
        if (session.getAttribute("provider") != null)
        	model1 = new ModelAndView("providerAddEvent");
        else
            model1 = new ModelAndView("redirect");
        return model1;
	}
	
	
	@RequestMapping(value = "/myProfile", method = RequestMethod.GET)
	public ModelAndView getProfile(HttpServletRequest req) {
        ModelAndView model1;
         HttpSession session = req.getSession();
        if (session.getAttribute("provider") != null)
        	model1 = new ModelAndView("providerProfile");
        else
            model1 = new ModelAndView("redirect");
        return model1;
	}
	
	@RequestMapping(value = "/buySub", method = RequestMethod.GET)
	public ModelAndView getBuySub(HttpServletRequest req) {
        ModelAndView model1;
        HttpSession session = req.getSession();
        if (session.getAttribute("provider") != null)
        	model1 = new ModelAndView("buySub");
        else
            model1 = new ModelAndView("redirect");
        return model1;
	}


	@RequestMapping(value = "/addEvent/addImages", method = RequestMethod.POST)
	public ModelAndView addDetails(HttpServletRequest req) {
		ModelAndView model1;
		
		try{
			DataAccess db = Configuration.getInstance().getDataAccess();
			HttpSession session = req.getSession(false);

			Provider prov = (Provider) session.getAttribute("provider");

			String time = req.getParameter("time");
			if (time.length() <= 4) time = "0" + time;
			time += ":00";
			String date = req.getParameter("date") + " " + time;
			String[] arrayTags = {"Αθλητισμός", "Θέατρο", "Μουσική", "Εργαστήρι", "Άλλες"};
			int[] numTags = {
					Integer.parseInt(req.getParameter("sports")),
					Integer.parseInt(req.getParameter("theatre")),
					Integer.parseInt(req.getParameter("music")),
					Integer.parseInt(req.getParameter("workshop")),
					Integer.parseInt(req.getParameter("other")),
			};
			String tags = "";
			for (int i = 0; i < 5; i++) {
				if (numTags[i] == 1) tags += arrayTags[i] + " , ";
			}
			Place pl = new Place(prov.getId(), req.getParameter("title"), "", Double.parseDouble(req.getParameter("lat")), Double.parseDouble(req.getParameter("lng")));

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
			String imageNames = "";
			ne.setImages(imageNames);

			long id = db.createEvent(ne);
			session.setAttribute("id",id);
			model1 = new ModelAndView("imagesUpload");
			return model1;
		}
		catch (Exception e){
			e.printStackTrace();
			model1 = new ModelAndView("providerAddEvent");
			model1.addObject("error", "Η δραστηριότητα δεν καταχωρήθηκε, προσπαθήστε πάλι");
			return model1;
		}
	}



    @RequestMapping(value = "/addEvent/addFinal", method = RequestMethod.POST)
    public ModelAndView addImages(@RequestParam("images") MultipartFile[] images, HttpServletRequest req){

        ModelAndView model1;
        DataAccess db = Configuration.getInstance().getDataAccess();
        try {
            String imageNames = "";
            for(int i=0 ; i<images.length ; i++){
                imageNames += images[i].getOriginalFilename()+",";
            }

            HttpSession session = req.getSession(false);
            long eventId = (long) session.getAttribute("id");

            Optional<Event> optional = db.getEventById(eventId);
            Event ne = optional.orElseThrow(() -> new Exception("Event Not Found"));
            ne.setImages(imageNames);
            db.setImages(ne);
            for(int i=0 ; i<images.length ; i++) {
                if (!images[i].isEmpty()) {
                    String rootPath = session.getServletContext().getRealPath("/");
                    File dir = new File(rootPath + File.separator + "eventImages" + File.separator + String.valueOf(eventId));
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    File serverFile = new File(dir.getAbsolutePath() + File.separator + images[i].getOriginalFilename());


					try (InputStream is = images[i].getInputStream(); BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile))) {
                            int j;
                            while ((j = is.read()) != -1) {
                                stream.write(j);
                            }
                            stream.flush();
							String path = dir.getAbsolutePath() + File.separator + images[i].getOriginalFilename();
							Provider prov = (Provider) session.getAttribute("provider");
							String text = prov.getCompany_name();
							Watermark.addTextWatermark(text, path);
                    }
					catch (IOException e) {
                        System.out.println("error : " + e.getMessage());
						model1 = new ModelAndView("imagesUpload");
						model1.addObject("error", "Οι φωτογραφίες δεν καταχωρήθηκαν, προσπαθήστε πάλι");
						return model1;
                    }
                }
            }
            session.removeAttribute("id");
			model1 = new ModelAndView("imagesUpload");
			return model1;
        }
        catch (Exception e){
            e.printStackTrace();
			model1 = new ModelAndView("imagesUpload");
			model1.addObject("error", "Οι φωτογραφίες δεν καταχωρήθηκαν, προσπαθήστε πάλι");
			return model1;
        }
	}

}


