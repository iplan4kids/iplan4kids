package gr.ntua.ece.softeng17b.services;

import gr.ntua.ece.softeng17b.data.DataAccess;
import gr.ntua.ece.softeng17b.data.Elastic;
import gr.ntua.ece.softeng17b.data.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreateEventService {

    @Autowired
    DataAccess dbAccess;

    @Autowired
    Elastic elastic;

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor={Throwable.class, NullPointerException.class ,RuntimeException.class, Exception.class})
    public Event doCreateEvent(Event ne) throws RuntimeException{
         Event nne = dbAccess.createEvent(ne);
         //elastic = null;
         try {
             elastic.add(nne);
         }
         catch (Exception e){
             throw new RuntimeException("Transactional not working");
         }
        return nne;
    }

}
