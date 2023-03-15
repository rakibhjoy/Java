package  Classes;
import java.lang.*;
import Interfaces.*;
public class Pathology implements SelectTestInt,UserInt,PatientInt
{

	private UserList users[] = new  UserList[1000];
	
	private PatientForm patient[] = new  PatientForm[1000];
	
	private SelectTest select[] = new  SelectTest[1000];
	
	
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
			System.out.println("user Inserted");
			c++;
		}
		if(a==0)
		{
			System.out.println("Can Not Insert");
		}
	}
	
	
	
	
	public void showAllUserList()
	{
		for(UserList u : users )
		{
			if(u==null)
			{
				System.out.println("                        =========================================================");
				System.out.println("                        ||||||||||||||||No Invoice Created|||||||||||||||||||||||");
				System.out.println("                        =========================================================");
				b=0;
				break;
			}
			else if(u != null)
			{
				System.out.println("    ----------------------------------");
				System.out.println("      User ID     : "+b);
				System.out.println("      User Name   : "+ u.getUserName());
				System.out.println("      User Email  : "+ u.getEmail());
				//System.out.println("user Password: "+ u.getPassword());
				System.out.println("   ----------------------------------\n\n");
				
				b++;
			}
			if(b==c)
			{
				break;
			}
			
		}
		b=0;
	}
	
	int d=0;
	
	 public void insertPatientForm( PatientForm pa )
	{
		int a = 0;
	
		for(int i=0; i<patient.length; i++)
		{
			if( patient[i] == null)
			{
				patient[i] = pa;
				a = 1;
				
				break;
			}
		}
		if(a == 1)
		{
			System.out.println("user Inserted");
			d++;
		}
		if(a==0)
		{
			System.out.println("Can Not Insert");
		}
	}
	
	
	
	
	public void showAllPatientForm()
	{
		for(PatientForm pa : patient )
		{
			if(pa==null)
			{
				System.out.println("No Account Created");
				b=0;
				break;
			}
			else if(pa != null)
			{
				System.out.println("User ID                 : "+b);
				System.out.println("Patient Name            : "+ pa.getFullName());
				System.out.println("Patient Age             : "+ pa.getAge());
				System.out.println("Patient Gender          : "+pa.getGender());
				System.out.println("Patient BloodGroup      : "+ pa.getBloodGroup());
				System.out.println("Patient Phone Number    : "+pa.getPhoneNumber());
				System.out.println("Patient Phone Number    : "+pa.getEmail());
				System.out.println("Patient Phone Number    : "+pa.getAddress());
				System.out.println("Patient Appointed Doctor: "+pa.getAppointedDoctor());
				
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
				b++;
			}
			if(b==d)
			{
				break;
			}
			
		}
		b=0;
	
	}
	
	
	///////////
	int e=0;
	 public void insertSelectTest( SelectTest s)
	{
		int a = 0;
	
		for(int i=0; i<select.length; i++)
		{
			if( select[i] == null)
			{
				select[i] = s;
				a = 1;
				e++;
				break;
			}
		}
		if(a == 1)
		{
			System.out.println(".......................... Inserted.................................");
			
		}
		if(a==0)
		{
			System.out.println("Can Not Insert");
		}
	}
	
	
	
	
	public void showAllSelectTest()
	{
		for(SelectTest s : select )
		{
			if(s==null)
			{
				System.out.println("                        =========================================================");
				System.out.println("                        ||||||||||||||||No Invoice Created|||||||||||||||||||||||");
				System.out.println("                        =========================================================");
				b=0;
				break;
			}
			else if(s != null)
			{
				System.out.println("User ID              : "+b);
				System.out.println("User ID              : "+s.getArray());
				System.out.println("Patient Name         : "+ s.getFullName());
				System.out.println("Patient Age          : "+ s.getAge());
				System.out.println("Patient Phone Number : "+s.getPhoneNumber());
				System.out.println("Patient Phone Number : "+s.getEmail());
				System.out.println("Patient Phone Number : "+s.getAddress());
				//System.out.println("Patient Phone Number: "+s.Amount());
				
				
				
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				b++;
			}
			if(b==e)
			{
				break;
			}
			
		}
		b=0;
	}
	
	
	
	
}
	
	
	