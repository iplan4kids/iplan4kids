package gr.ntua.ece.softeng17b.data;

import java.sql.Timestamp;
import java.util.Date;

public class Event {

    private long prov_id;
    private long event_id;
    private String title;
    private Date date;
    private int tickets;
    private double price;
    private String description;
    private String tags;
    private String images;
    private Place place;
    private int duration;

    //GETTERS

    public long getProv_id() {
        return prov_id;
    }

    public long getEvent_id() {
        return event_id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public int getTickets() {
        return tickets;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public String getImages() {
        return images;
    }

    public Place getPlace() {
        return place;
    }

    public int getDuration(){ return duration; }

    //SETTERS


    public void setProv_id(long prov_id) {
        this.prov_id = prov_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
