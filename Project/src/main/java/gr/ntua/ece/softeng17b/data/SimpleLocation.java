package gr.ntua.ece.softeng17b.data;

public class SimpleLocation{

    private double latitude;
    private double longitude;

    public SimpleLocation(double latitude, double longitude) {
        this.latitude  = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}