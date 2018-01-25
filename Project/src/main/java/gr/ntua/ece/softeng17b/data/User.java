package gr.ntua.ece.softeng17b.data;

public abstract class User {
	
	protected int id;
    protected String username;
    protected String password;
    protected String salt;
    protected String first_name;
    protected String last_name;
    protected String email;
    protected String m_phone;
    
    abstract boolean login();

}
