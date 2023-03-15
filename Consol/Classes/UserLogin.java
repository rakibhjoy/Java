package  Classes;
import java.lang.*;
import java.util.*;
import Interfaces.*;
public class UserLogin extends User
{	
	
	Scanner input = new Scanner(System.in);
    UserList users[] = new  UserList[1000];
	
	int b=0;
	int c=0;
	 
	 
	
	public void insertUserList( UserList u )
	{
		int a = 0;
	
		for(int i=0; i<users.length; i++)
		{
			if( users[i] == null)
			{
				users[i] = u;
				a = 1;
				break;
			}
		}
		if(a == 1)
		{
			c++;
			System.out.println("|||||||||||||||||||||||||||||||||||||Your Account is Ready for User Login........|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		else
		{
			System.out.println("|||||||||||||||||||||||||||||||||Your Account is Not Ready For User Login.||||||||||||||||||||||||||||||||||||||||||||||||| \n");
		}
	}
	
	
	public void showAllUserList()
	{
		
		for(UserList u : users )
		{
			if(u==null)
			{
				System.out.println("                                    ...........No Account Created...........\n");
				System.out.println("                               ================================================\n\n");
				b=0;
				break;
			}
			else if(u != null)
			{
				System.out.println("                                          User ID: "+b);
				System.out.println("                                          User Name: "+ u.getUserName());
				System.out.println("                                          Uer Email: "+ u.getEmail());
				//System.out.println("user Password: "+ u.getPassword());
				System.out.println("                                       ----------------------------------");
				System.out.println("                                       ----------------------------------");
				b++;
			}
			if(b==c)
			{
				break;
			}
			
		}
		b=0;
	}
	
	
     	
	public int UserLogin()	
	{
		int a=0;
		int b=0;
		 for(UserList u : users)
		 {
			 
			
		   if(u!=null)
		    {
				 
		     
				
				if(a == userId) 
				{
			   
				
		   
		         
				   if(email.equals(u.getEmail())&&userName.equals(u.getUserName()) && password.equals(u.getPassword()))
				   {
					   System.out.println("                                            ======================================================");
					   System.out.println("                                                  ================Login Successful=========\n\n");
					   System.out.println("                                            ======================================================");
					    
						b=20;
						
					   
					   break;
				   }
				
				  else 
				  {
					  
					 System.out.println("                                          ...........Try Again...........\n");
					 System.out.println("                                          ---------------------------------------\n");
					 break;
					
				  }
				  
				  
			
			
		        }
				/*else
				{
					System.out.println(" ..........Invalid ID ........");
					System.out.println(" .......... Try Again.........");
					System.out.println("------------------------------------------\n");
					break;
				}*/
			
			
		
		
			
		    } // end of if user null
			
			else if(u==null) 	
			{
				b=10;
				System.out.println("                        =========================================================");
				System.out.println("                        ||||||||||||||||No Invoice Created|||||||||||||||||||||||");
				System.out.println("                        =========================================================");
				break;
			}
			
		
	
	
	      a++;
		   
          
         } // end of for loop
		 
		 
		return b;
	
    }
}