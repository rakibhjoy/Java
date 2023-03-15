package  Classes;
import java.util.*;
public class Admin
{
	private String adminId;
	private String adminPassword;
    boolean chioce=true;
	
	 
	Scanner input =new Scanner(System.in);	
	

	public void idPassCheek()
	{
		
		while(chioce)	
		{
			
	    System.out.println("        ======================================================");		
		System.out.print("             Enter Your User Name     :_ ");
		adminId = input.next();
		System.out.println("        ======================================================");
		
        System.out.println("        ======================================================");		
		System.out.print("              Enter Your Password      :_ ");
		adminPassword = input.next();
		System.out.println("        ======================================================");
		
		
		if(adminId.equals("TeamB28")&& adminPassword.equals("1234"))
		{
	        System.out.println("                                                            ======================================================");
			System.out.println("                                                                  ================Login Successful=========\n");
			System.out.println("                                                            ======================================================");
			
			chioce=false;
			break;
		}
			
		else
		{
		System.out.println("                          ..................................Invalid User Name OR Password....................................");
		
		System.out.println("                          ......................................please Try Again>>>>..........................................");
	    }
		
		
		}
		
	}
		
		
		
	}

	
