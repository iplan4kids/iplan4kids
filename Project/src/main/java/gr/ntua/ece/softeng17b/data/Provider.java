package gr.ntua.ece.softeng17b.data;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class Provider extends User {

    private String afm;
    private String iban;
    private String company_name;
    private String postal_code;
    private String phone;
    private String city;
    private String address;
    private String address_num;
    private Timestamp subscription;
    private double longtitude;
    private double latitude;
    private boolean disabled;
    private boolean blocked;
    private double dept;


    //GETTERS

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getAfm() {
        return afm;
    }

    public String getIban() {
        return iban;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getM_phone() {
        return m_phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress_num() {
        return address_num;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getSubscription() {
        return subscription;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public boolean isDisabled(){
        return disabled;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public double getDept(){return dept;}

    // SETTERS

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setM_phone(String m_phone) {
        this.m_phone = m_phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddress_num(String address_num) {
        this.address_num = address_num;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubscription(Timestamp subscription){
        this.subscription = subscription;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setDept(double dept){ this.dept = dept;}


    //-------------------------------------------------

    public boolean login(){
        return true;
    }
}
