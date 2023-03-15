package  Classes;
import Interfaces.*;
import java.lang.*;
public class UserList 
{
	protected String userName;
	protected String email;
	protected String password;
	
	
	
	public void setUserName(String userName){this.userName=userName;}
	
	public void setPassword(String password){this.password=password;}
	
	public void setEmail(String email){this.email=email;}
	
	public String getUserName(){return userName;} 
	public String getPassword(){return password;}
	public String getEmail(){return email;} 
	
	
	
	
}