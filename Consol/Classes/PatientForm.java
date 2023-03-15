package  Classes;
import Interfaces.*;
import java.util.Scanner;
import java.lang.*;
public class PatientForm
{
	protected String fullName;
	protected String age;
	protected String gender;
	protected String bloodGroup;
	protected String phoneNumber;
	protected String email;
	protected String address;
	protected String appointedDoctor;
	
	
	public void setFullName(String fullName)
	 {
		 this.fullName=fullName;
	 }
    public void setAge(String age)
	 {
		 this.age=age;
	 }
    public void setGender(String gender)
	 {
		 this.gender=gender;
	 }
	public void setBloodGroup(String bloodGroup)
	 {
		 this.bloodGroup=bloodGroup;
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
	public void setAppointedDoctor(String appointedDoctor)
	 {

		 this.appointedDoctor=appointedDoctor;
	 }	 
	 
	 
	public String getFullName( )
	 {
		return fullName;
	 }
    public String getAge( )
	 {
		return age;
	 }
    public String getGender()
	 {
		 return gender;
	 }
	public String getBloodGroup( )
	 {
		 return bloodGroup;
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
	public String getAppointedDoctor()
	 {

		 return appointedDoctor;
	 }	 
	 
	 
	 
	 
	 
	 
	 
}