package main.java.gr.ntua.ece.softeng17b.data;

public abstract class User {
	
	private int id;
    private String username;
    private String password;
    private String salt;
    private String first_name;
    private String last_name;
    private String email;
    private String m_phone;
    
    abstract boolean login();

}
