package gr.ntua.ece.softeng17b.data;

public class Client extends User{

    private String postal_code;
    private String city;
    private String address;
    private String address_num;
    private String latitude;
    private String longtitude;
    private double balance;

    // GETTERS

    public int getId() {
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

    // SETTERS

    public void setId(int id) {
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

    public boolean login(){return true;}
}
