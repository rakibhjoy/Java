package  Classes;
public class Invoice
{
	
	protected int size;
	protected String showTest[] = new String [size];
	protected String fullName;
	protected String age;
	protected String phoneNumber;
	protected String email;
	protected String address;
	
	
	
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
		 
	 
	 
	
	//set get End
	
	public void setSize(int size){
		this.size=size;
		System.out.println("Size"+size);
		
	}
	
	public void setArray(String[] showTest){
		this.showTest=showTest;
		
		
	}
	
	//Amount start
	public static boolean isNumeric(String str) { 
  try {  
    Double.parseDouble(str);  
    return true;
  } 
  catch(NumberFormatException e){  
    return false;  
  }  
}
	public void Amount()
	{
		String num="";
		int sum=0;
		int total=0;
		int i=0;
		

		
		while(i<size)
		{
			String str = showTest[i];
			
			String[] s = str.split("\\s+");
			
			
				for(String d: s){
					
			  if(this.isNumeric(d))
			   {
				   int temp = Integer.parseInt(d);
				   sum =sum+temp;	   
	
			   }
							
					
				}
				
			
			i++;
	    }
		System.out.println("\n\n");
		System.out.println("                                   .............Invoice For Patient..............");
		System.out.println("                                   Patient Name         : "+ fullName);
	    System.out.println("                                   Patient Age          : "+ age);
		System.out.println("                                   Patient Phone Number : "+phoneNumber);
		System.out.println("                                   Patient Phone Number : "+email);
		System.out.println("                                   Patient Phone Number : "+address);
		for(int a = 0; a<showTest.length; a++)
			{
					 
			
			  System.out.println(showTest[a]);
				
			
			}
		System.out.println("                           -------------------------------------------------------------  ");
		
		System.out.println("                                  Total Amount   =             "+sum);
		System.out.println("\n\n");
		System.out.println("                       =====================================||===============================");
		
		
	}
	
	
}