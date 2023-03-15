package  Classes;
import Interfaces.*;
import java.util.Scanner;
import java.lang.*;

public class SelectTest
{
	protected int size;
	protected String fullName;
	protected String age;
	protected String phoneNumber;
	protected String email;
	protected String address;
	
	protected String showTest[] = new String [size];
	
	public void setFullName(String fullName)
	 {
		 this.fullName=fullName;
	 }
    public void setAge(String age)
	 {
		 this.age=age;
	 }
  
	public void setPhoneNumber(String phoneNumber)
	 {
		 this.phoneNumber=phoneNumber;
	 }
	public void setEmail(String email)
	 {
		 this.email=email;
	 }
	public void setAddress(String address)
	 {
		 this.address=address;
	 }
		 
	 
	 
	public String getFullName( )
	 {
		return fullName;
	 }
    public String getAge( )
	 {
		return age;
	 }
   
	
	public String getPhoneNumber()
	 {
		 return phoneNumber;
	 }
	public String getEmail()
	 {
		 return email;
	 }
	public String getAddress()
	 {
		 return address;
	 }
	 
	
	public void setSize(int size){
		this.size=size;
		System.out.println("Size"+size);
		
	}
	
	public void setArray(String[] showTest){
		this.showTest=showTest;
		
	}
	public String[] getArray(){
		
		String showTest1[] = new String [size];
		for(int j = 0; j<size; j++)
			{
				showTest1[j]=showTest1[j];
			   System.out.println(showTest[j]);
		
			}
			return showTest;
		
	}
	
	
}			