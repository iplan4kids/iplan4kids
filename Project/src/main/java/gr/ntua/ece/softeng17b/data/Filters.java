package gr.ntua.ece.softeng17b.data;

public class Filters {


    private Long numberOfKm;
    private double findAddr;
    private double lng;
    private double lat;
    private String date;
    private double max;
    private double min;
    private String[] categories;

    public void setDate(String date) {
        this.date = date;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setFindAddress(double findAddr) {
        this.findAddr = findAddr;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setNumberOfKm(Long numberOfKm) {
        this.numberOfKm = numberOfKm;
    }


    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getFindAddr() {
        return findAddr;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getDate() {
        return date;
    }

    public Long getNumberOfKm() {
        return numberOfKm;
    }

}



