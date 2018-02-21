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


    abstract int getId();

    abstract String getUsername();

    abstract String getPassword();

    abstract String getFirst_name();

    abstract String getLast_name();

    abstract String getEmail();

    abstract String getM_phone();


    // SETTERS

    abstract void setId(int id);

    abstract void setUsername(String username);

    abstract void setPassword(String password);

    abstract void setFirst_name(String first_name);

    abstract void setLast_name(String last_name);

    abstract void setEmail(String email);

    abstract void setM_phone(String phone);

    abstract boolean login();

}
