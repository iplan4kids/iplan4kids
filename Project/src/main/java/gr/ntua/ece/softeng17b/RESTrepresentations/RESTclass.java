package gr.ntua.ece.softeng17b.RESTrepresentations;

public class RESTclass{
	
	private boolean success;
	private String username;
	private double balance;

	public RESTclass(boolean success, String username, double balance){
		this.success = success;
		this.username = username;
		this.balance = balance;
	}
	
	public boolean getSuccess(){
		return success;
	}	

	public String getUsername(){
		return username;
	}
	
	public double getBalance(){
		return balance;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}
	
	public void setUsername(String username){
		this.username = username;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

}
