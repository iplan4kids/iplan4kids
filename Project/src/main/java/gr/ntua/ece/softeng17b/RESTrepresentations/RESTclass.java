package gr.ntua.ece.softeng17b.RESTrepresentations;

public class RESTclass{
	
	private String username;
	private double balance;

	public RESTclass(String username, double balance){
		this.username = username;
		this.balance = balance;
	}

	public String getUsername(){
		return username;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setUsername(String username){
		this.username = username;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

}
