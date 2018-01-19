package gr.ntua.ece.softeng17b.data;

public class Provider {

    private String afm;
    private String iban;
    private String postal_code;
    private String phone;
    private String city;
    private String address;
    private String address_num;


    //GETTERS

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getAfm() {
        return afm;
    }

    public String getIban() {
        return iban;
    }

    public String getM_first_name() {
        return m_first_name;
    }

    public String getM_last_name() {
        return m_last_name;
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

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setM_first_name(String m_first_name) {
        this.m_first_name = m_first_name;
    }

    public void setM_last_name(String last_name) {
        this.m_last_name = last_name;
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

}
