package gr.ntua.ece.softeng17b.data;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class Client extends User{

    private String postal_code;
    private String city;
    private String address;
    private String address_num;
    private double latitude;
    private double longtitude;
    private double balance;
    private double bonus;
    private boolean disabled;
    private boolean blocked;

    // GETTERS

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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

    public double getWallet() {
        return balance;
    }

    public double getBonus(){return bonus;}

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public boolean isBlocked() {
        return blocked;
    }

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

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setM_phone(String phone) {
        this.m_phone = phone;
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

    public void setWallet(double wallet) {
        this.balance = wallet;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public boolean login(){return true;}

    public double getLongtitude() {
        return longtitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
