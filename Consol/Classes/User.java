package  Classes;
import java.lang.*;
import java.util.*;
public class User 
{
	protected String userName;
	protected String email;
	protected String password;
	protected int userId;
	
	 
	public void setUserId(int userId){this.userId=userId;}
	public void setUserName(String userName){this.userName=userName;}
	public void setPassword(String password){this.password=password;}
	public void setEmail(String email){this.email=email;}
	
	public int getUserId(){return userId;} 
	public String getUserName(){return userName;} 
	public String getPassword(){return password;}
	public String getEmail(){return email;} 
	
	
	
	 
	
	
	
}