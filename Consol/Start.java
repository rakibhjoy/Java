import java.lang.*;
import Classes.*;
import Fileio.*;
import java.util.*;
import java.util.InputMismatchException;


public class Start
{
	static Scanner input = new Scanner(System.in).useDelimiter("\r\n");
	
	public static void main(String args [] )
	{
		System.out.println("\n\n\n========================================================================================================================================================================");
		System.out.println("==============================================================================================================================================================================");
		System.out.println("                                           //||                                             I T H         R  A      B            H       Z A N D M     || \\   ");
		System.out.println("                                          // || T                 T   T E A M    P         A     S     D.      K    N  I       S A       M             ||  \\   ");
		System.out.println("                                         //  ||  E               E    G          A        K    I       M        I   A   N    U   R       U S I R       ||   \\ ");
		System.out.println("                                        //   ||   A     8 8     A     R 2 8      R        A            3        B   T      T     -       L             ||    \\ ");
		System.out.println("                                       //    ||    M  2     2  M      O          T         H      -2    N      H    D            0       H             ||     \\  ");
		System.out.println("                                      //     ||     B         B       U P - 5    H A-1 I     M  D         S  A      M            4       O S S I N     ||      \\  ");
		System.out.println("                                     //      ||                                                                                                        ||       \\ ");
		System.out.println("                                    //       ||                                                                                                        ||        \\  ");
		System.out.println("==============================================================================================================================================================================");
		System.out.println("==============================================================================================================================================================================\n\n");
		
		
		
		
		
		System.out.println();
    System.out.println("                                              **********  *******           *	         *           *     ***********       * * * * * * *           ************    ");	
    System.out.println("                                                  **      *               *   *          **         **     *          *      *           *            *         *          "); 
    System.out.println("                                                  **      *              *     *         *   *   *   *     *          *                  *             *       *             "); 
    System.out.println("                                                  **      ***           *       *        *     *     *     *********            * * * * *              *********               "); 
    System.out.println("                                                  **      *            *  *****  *       *           *     *          *       *                        *        *            "); 
    System.out.println("                                                  **      *           *           *      *           *     *          *      *            *           *          *         "); 
    System.out.println("                                                  **      ********   *             *     *           *     ***********       * * * * * * *            ************         \n\n\n "); 
	    System.out.println("=====================================================================================================================================================================");
		 System.out.println("=====================================================================================================================================================================");
		 
		 Clear clear = new Clear();
		 char cl;
		for(;;)
		{
		
		System.out.println("                                          For Next Page (n or N) ");
		System.out.println("                                          To Stay Here (S or s) ");
		System.out.print("                                            Enter your choice: ");
		cl = input.next().charAt(0);
		
		if(cl=='N'||cl=='n')
		{
			clear.clrscr();
			break;
		}
		else if(cl=='S'||cl=='s')
		{
			System.out.println("                                ............... Ok..............");
		}
		else{
			System.out.println("                                         Invalid Choice... ");
		}
		}
		 
		 
		 
		System.out.println("                                                                        ===============================================");
		System.out.println("                                                                        ==          =======Welcome========           =="); 
		System.out.println("                                                                        ==     PATHOLOGY MANAGEMENT SYSTEM           ==");
		System.out.println("                                                                        ===============================================");
		
		System.out.println(" =========================================================                                                                                       ");
		System.out.println(" =       ||         Group Member          ||             =                                                                                          ");
		System.out.println(" =       ===================================             =                                                                                                      ");
		System.out.println(" =          1.Partha Roy (20-43575-1)                    =                                                                                                         ");
		System.out.println(" =          1.Ishtiak Ahmed(20-43553-1)                  =                                                                                                          ");
		System.out.println(" =          1.Rabik Hasan (20-43540-1)                   =                                                                                                             ");
		System.out.println(" =          1.Tanbin Tushar (20-43573-1)                 =                                                                                                               ");
		System.out.println(" =========================================================                                                                                                                ");
		System.out.println(" =========================================================                                                                                                              \n\n\n     ");
		
		
		
		
		System.out.println("                                             ==============================================================     ");
		System.out.println("                                             =       ||          INSTRUCTION         ||                   =      ");
		System.out.println("                                             =       ===================================                  =     ");
		System.out.println("                                             = # At frist create a account for USER LOGIN                 =  ");
		System.out.println("                                             = # If Any user without an account tries to Enter USER LOGIN =         ");
		System.out.println("                                             =   Massgess will Show [No Account Create]                   =    ");
		System.out.println("                                             = # Only Admin Can See Every thing                           =      ");
		
		System.out.println( "                                            ==============================================================   ");
		System.out.println("                                             ==============================================================    ");  
		
		
		
		
		
		
		boolean choice = true;
		boolean y = true;
		int total=0;
		
		Scanner input =new Scanner(System.in);
		File1 file1 = new File1();
		File2 file2 = new File2();
		Pathology p = new Pathology();
		UserLogin ulogin = new UserLogin();
		
		
		System.out.println("\n\n\n\n\n");
		
		
		for(;;)
		{
		
		System.out.println("                                          For Next Page (n or N) ");
		System.out.println("                                          To Stay Here (S or s) ");
		System.out.print("                                            Enter your choice: ");
		cl = input.next().charAt(0);
		
		if(cl=='N'||cl=='n')
		{
			clear.clrscr();
			break;
		}
		else if(cl=='S'||cl=='s')
		{
			System.out.println("                                ............... Ok..............");
		}
		else{
			System.out.println("                                         Invalid Choice... ");
		}
		}
		 
		
		while(y)
		{ 	
	        System.out.println("                                                                        ================================  ");
			System.out.println("                                                                        ||   Choice Anyone Of Then    ||  ");
			System.out.println("                                                                        ================================ ");
	
			System.out.println("                                    =========================== ");
			System.out.println("                                    //  1.Admin Login...     // ");
			System.out.println("                                    =========================== \n\n");
			
			
		    System.out.println("                                                                 =========================== ");
			System.out.println("                                                                 //  2.User Login...      //  ");
			System.out.println("                                                                ===========================\n\n ");
			
		    System.out.println("                                                                                       =========================== ");
			System.out.println("                                                                                       //  3.Sign up...         //  ");
			System.out.println("                                                                                       =========================== \n\n");
			
		    System.out.println("                                                                                                            ================================= ");
			System.out.println("                                                                                                           //4.Exit form the Application   //  ");
			System.out.println("                                                                                                           ================================== \n\n");
			
			 System.out.println("                       ======================================================================= ");
		     System.out.println("                       // If you have no account please create new one(as Sign up--3).      //"); 
	         System.out.println("                       ======================================================================= ");
	  
	  

		    
					int fi1=0;
					boolean trycatch=true;
					while(trycatch)
					{
						try{
				        System.out.println("                  =================================================");
		                System.out.print("                            Enter your choice:          ");
	                    fi1 = input.nextInt();
						System.out.println("                  =================================================\n");
						trycatch=false;
				        }
				        catch(InputMismatchException e){
							System.out.println("                  =================================================");
							System.out.println("Exception....!!!");
					        System.out.println("Please Input Integer Number.");
							input.next();
							System.out.println("                  =================================================\n");
							
				        }
					
					}
		   
		   
		   
			System.out.println("         \n          Loding............................");
			clear.clrscr();
		
		    switch(fi1)
			{
				
				
				case 1:
				System.out.println("================||==============\n\n");
			
			    System.out.println("You Select Admin Login\nNext......");
			
			    Admin a1 = new Admin();
			
			    a1.idPassCheek();
				
				boolean case1=true;
				System.out.println("....................................\n");
				
				while(case1)
				{
					boolean case12;
					
					
					
		    System.out.println("                                                                        ================================  ");
			System.out.println("                                                                        ||   Choice Anyone Of Then    ||  ");
			System.out.println("                                                                        ================================ ");
	
			System.out.println("                                    ===================================== ");
			System.out.println("                                    //        1.User List              // ");
			System.out.println("                                    ===================================== \n\n");
			
			
		    System.out.println("                                                                 =========================== ");
			System.out.println("                                                                 //  2. 2.Test List...      //  ");
			System.out.println("                                                                ===========================\n\n ");
			
		    System.out.println("                                                                                       ============================= ");
			System.out.println("                                                                                       //      3.Patient List     //  ");
			System.out.println("                                                                                       ============================= \n\n");
			
		    System.out.println("                                                                                                            ======================= ");
			System.out.println("                                                                                                           //4..Invoice List    //  ");
			System.out.println("                                                                                                           =======================\n\n");
			
			
			
		    System.out.println("                                                                            ========================== ");
			System.out.println("                                                                            //      5.Back          //  ");
			System.out.println("                                                                            =========================== \n\n");
			
		  
			
			 System.out.println("                       ======================================================================= ");
		     System.out.println("                       // If you have no account please create new one                      //"); 
	         System.out.println("                       ======================================================================= ");
	  
	  
	        
			
			int se1=0;
					 trycatch=true;
					while(trycatch)
					{
						try{
				        System.out.println("                  =================================================");
		                System.out.print("                            Enter your choice:          ");
	                    se1 = input.nextInt();
						System.out.println("                  =================================================\n");
						trycatch=false;
				        }
				        catch(InputMismatchException e){
							System.out.println("                  =================================================");
							System.out.println("Exception....!!!");
					        System.out.println("Please Input Integer Number.");
							input.next();
							System.out.println("                  =================================================\n");
							
				        }
					
					}
			
		
		   
		   
		   
			System.out.println("         \n          Loding............................");
			
			clear.clrscr();
		
			   
				
				
			   
				
				System.out.println("....................................\n");
				
			
			    switch(se1)
				{
					case 1:
					
					System.out.println("                                                                                        ====================================  ");
			        System.out.println("                                                                                        |||||||||||||| USER  LIST ||||||||||     ");
			        System.out.println("                                                                                        ==================================== \n\n\n");
				    ulogin.showAllUserList();
					System.out.println("\n\n                                =========================================================================\n\n");
	    for(;;)
		{
		
		System.out.println("                                          For Next Page (n or N) ");
		System.out.println("                                          To Stay Here (S or s) ");
		System.out.print("                                            Enter your choice: ");
		cl = input.next().charAt(0);
		
		if(cl=='N'||cl=='n')
		{
			clear.clrscr();
			break;
		}
		else if(cl=='S'||cl=='s')
		{
			System.out.println("                                ............... Ok..............");
		}
		else{
			System.out.println("                                         Invalid Choice... ");
		}
		}
					
					
					//file1.readFromFile();
					
				    
				    case12 = true;
				    break;
				
				
				    case 2:
					
					
					System.out.println("                                                                                        ====================================  ");
			        System.out.println("                                                                                        |||||||||||||| TEST  LIST ||||||||||     ");
			        System.out.println("                                                                                        ==================================== \n\n\n");
			        System.out.println("\n\n");
				    TestList t1 = new TestList();
				    t1.showTest();
					System.out.println("\n\n              ==========================================================================\n\n");
					for(;;)
					{
		
		System.out.println("                                          For Next Page (n or N) ");
		System.out.println("                                          To Stay Here (S or s) ");
		System.out.print("                                            Enter your choice: ");
		cl = input.next().charAt(0);
		
		if(cl=='N'||cl=='n')
		{
			clear.clrscr();
			break;
		}
		else if(cl=='S'||cl=='s')
		{
			System.out.println("                                ............... Ok..............");
		}
		else{
			System.out.println("                                         Invalid Choice... ");
		}
		}
		 
					case12 = true;
				    break;
					
				
			       	case 3:
					
					System.out.println("                                                                                        ====================================  ");
			        System.out.println("                                                                                        ||||||||||| PATIENT  LIST ||||||||||     ");
			        System.out.println("                                                                                        ==================================== \n\n\n");
					p.showAllPatientForm();
					System.out.println("\n\n                                    ===================================================================================\n\n");
					for(;;)
		{
		
		System.out.println("                                          For Next Page (n or N) ");
		System.out.println("                                          To Stay Here (S or s) ");
		System.out.print("                                            Enter your choice: ");
		cl = input.next().charAt(0);
		
		if(cl=='N'||cl=='n')
		{
			clear.clrscr();
			break;
		}
		else if(cl=='S'||cl=='s')
		{
			System.out.println("                                ............... Ok..............");
		}
		else{
			System.out.println("                                         Invalid Choice... ");
		}
		}
		 
					case12 = true;
					break;
				
				    case 4:
					
					
					System.out.println("                                                                                        ====================================  ");
			        System.out.println("                                                                                        ||||||||||| INVOICE  LIST ||||||||||     ");
			        System.out.println("                                                                                        ==================================== \n\n\n");
					System.out.println("\n\n");
					p.showAllSelectTest();
					System.out.println("\n\n                                     =============================================================================================\n\n");
					
					for(;;)
		{
		
		System.out.println("                                          For Next Page (n or N) ");
		System.out.println("                                          To Stay Here (S or s) ");
		System.out.print("                                            Enter your choice: ");
		cl = input.next().charAt(0);
		
		if(cl=='N'||cl=='n')
		{
			clear.clrscr();
			break;
		}
		else if(cl=='S'||cl=='s')
		{
			System.out.println("                                ............... Ok..............");
		}
		else{
			System.out.println("                                         Invalid Choice... ");
		}
		}
		 
					case12 = true;
					break;
					
					case 5:
					clear.clrscr();
					case12 = false;
					break;
					
			
			      default:
			      System.out.println("Invalid Input");
				  System.out.println("\n\n========================================================\n\n");
				  case12 = true;
			      break;
					
					
				
				
			    }
				
			    if(case12==false)
				{break;}
				 
			    }
				break;
				
			
			    case 2: // Case 2 User Login
				
				choice = true;
				int userId;
	            String userName;
			    String email;
			    String password;
				int a=20;
				int b=0;
				int c=10;
				boolean isSuccess = false;
				
				 System.out.println("\n                                                                      =================================================\n\n");
			     System.out.println("                                                                        |||||||||||||||||  LOGIN ||||||||||||||||||||||||      ");
			     System.out.println("\n                                                                      =================================================\n\n");
				
				while(choice)
				{
					
				  System.out.println("                  ===============================================");
				  System.out.println("                  ###### Please fill up the given form  ########         ");
		          System.out.println("                  ===============================================");
					
					 
					userId=0;
					 trycatch=true;
					while(trycatch)
					{
						try{
				        System.out.println("                  =================================================");
		                System.out.print("User ID:_ ");
	                    userId = input.nextInt();
						System.out.println("                  =================================================\n");
						trycatch=false;
				        }
				        catch(InputMismatchException e){
							System.out.println("                  =================================================");
							System.out.println("Exception....!!!");
					        System.out.println("Please Input Integer Number.");
							input.next();
							System.out.println("                  =================================================\n");
							
				        }
					
					}
					
					System.out.println("                  =================================================");
					Scanner input1 =new Scanner(System.in);
		            System.out.print("                        User name    :_  ");
	                userName = input1.nextLine();
		            System.out.println("                  =================================================\n");
					
                    System.out.println("                  =================================================");
		            System.out.print("                         Email       :_  ");
	                email = input.next();
					System.out.println("                  =================================================\n");
					
					System.out.println("                  =================================================");
			        Scanner input2 =new Scanner(System.in);		
		            System.out.print("                         Password    :_  ");
	                password = input2.nextLine();
					System.out.println("                  =================================================\n");
				    
					
					
					ulogin.setUserId(userId);
					ulogin.setUserName(userName);
			        ulogin.setPassword(password);
			        ulogin.setEmail(email);
					
					int test;
					 
					test=ulogin.UserLogin();
					
					
					
					
					
				if(a== test)
				{
					
					choice=false;
					break;
				}
				else if(c== test)
				{	
				    isSuccess=true;
					choice =false;
					break;
				
				}
				else if(b==2)
				{
					isSuccess=true;
					choice =false;
					break;
				}
				 
              
				
				b++;
			} // End the while loop
			
				if(isSuccess){
					
				break;
			
				}// End if no account create
				
				
				
				boolean case2=true;
				
				while(case2)
				{
				
				boolean case22;
				
		    System.out.println("                                                                        ================================  ");
			System.out.println("                                                                        ||   Choice Anyone Of Then    ||  ");
			System.out.println("                                                                        ================================ ");
	
			System.out.println("                                    ===================================== ");
			System.out.println("                                    // 1.Create Patient Profile & Test // ");
			System.out.println("                                    ===================================== \n\n");
			
			
		    System.out.println("                                                                 =========================== ");
			System.out.println("                                                                 //  2..Patient List      //  ");
			System.out.println("                                                                ===========================\n\n ");
			
		    System.out.println("                                                                                       =========================== ");
			System.out.println("                                                                                       //  3.Invioce List       //  ");
			System.out.println("                                                                                       =========================== \n\n");
			
		    System.out.println("   \n\n                                                                                                         ===================== ");
			System.out.println("                                                                                                           //4. Back            //  ");
			System.out.println("                                                                                                           ======================\n\n");
			
			 System.out.println("                       ======================================================================= ");
		     System.out.println("                       // If you have no account please create new one                      //"); 
	         System.out.println("                       ======================================================================= ");
	  
	  
	        System.out.println("                             ____________________________ ");
		    System.out.print("                                   Enter your choice:          ");
			
		    System.out.println("                             ____________________________ ");
			int se2  =0;
		 trycatch=true;
					while(trycatch)
					{
						try{
							System.out.println("                                     ======================================================================= ");
							System.out.println("                                                      How many test DO you want to take?");
							System.out.print("                                                    >>>>>>");
							
		                     se2 = input.nextInt();
							trycatch=false;
				        }
				        catch(InputMismatchException e){
							System.out.println("                              ========================================================================");
							System.out.println("                                                         Exception....!!!");
					        System.out.println("                                             Please Input Integer Number.");
							input.next();
							System.out.println("                               ========================================================================");
				        }
					
					}
		   
		   
		   
			System.out.println("         \n          Loding............................");
			
			clear.clrscr();
		
				
				
				
			 switch(se2)
				{ 
					
					
					case 1:
					System.out.println("\n\n");
					 String fullName;
	                 String age;
	                 String gender;
	                 String bloodGroup;
	                 String phoneNumber;
	                 //String email;
	                 String address;
	                 String appointedDoctor;
					
					System.out.println("                                                                                        ====================================  ");
			        System.out.println("                                                                                        ||||||||||| PATIENT  FORM ||||||||||     ");
			        System.out.println("                                                                                        ==================================== \n\n\n");
					
					System.out.println("                  ||||||||||||||||Please fill the required information|||||||||||||||||");
		            System.out.println();
		
		
		            Scanner input1 =new Scanner(System.in);
					System.out.println("                ======================================================================= ");
		            System.out.print("                  || Name              : ");
		            fullName = input1.nextLine();
		            System.out.println();
		
		            System.out.println("               ======================================================================= ");
		            System.out.println();
		            System.out.print("                 || Age               : ");
		            age = input.next();
		            System.out.println();
		
		            System.out.println("               ======================================================================= ");
	              	System.out.print("                 || Gender            : ");
	             	gender = input.next();
		            System.out.println();
		
		            System.out.println("               ======================================================================= ");
		            System.out.print("                 || bloodGroup        : ");
		            bloodGroup = input.next();
		            System.out.println();
		
		           System.out.println("                ======================================================================= ");
		           System.out.print("                  || Phone Number      : ");
		           phoneNumber = input.next();
		           System.out.println();
		
		           System.out.println("                ======================================================================= ");
		           System.out.print("                  || Email             : ");
		           email = input.next();
		           System.out.println();
		
		           System.out.println("               ======================================================================= ");
		           System.out.print("                  || Address           :");
		           address = input.next();
	               System.out.println();
		
		           System.out.println("               ======================================================================= ");
		           System.out.print("                  || Appointed Doctor   : ");
		           appointedDoctor = input.next();
		           System.out.println();
				   
				   PatientForm pa = new PatientForm();
				   
				   pa.setFullName(fullName);
				   pa.setAge(age);
				   pa.setGender(gender);
				   pa.setBloodGroup(bloodGroup);
				   pa.setPhoneNumber(phoneNumber);
				   pa.setEmail(email);
				   pa.setAddress(address); 
				   pa.setAppointedDoctor(appointedDoctor); 
				   
				   file1.writeInFile("Patient name :"+fullName+"\nAge :"+age +"\nGender :"+gender+
				   "\nsetBloodGroup :"+bloodGroup+"\nPhone Number :"+phoneNumber+"\nEmail :"+email+"\n Address :"+address+"\n\n");
				   p.insertPatientForm(pa);
				   
				   for(;;)
		        {
		         System.out.println("                                         |||||||||||||||||||||||||||");
		         System.out.println("                                         || For Next Page( SECLECT TEST) Press (n or N)|| ");
		         System.out.println("                                         || To Stay Here (S or s) ||");
		         System.out.print("                                           || Enter your choice:  ");
		         cl = input.next().charAt(0);
		         System.out.print("||\n                                       ||||||||||||||||||||||||||||");
	        	if(cl=='N'||cl=='n')
		         {
		         	clear.clrscr();
			        break;
		         }
		        else if(cl=='S'||cl=='s')
		         {
		        	System.out.println("                                ............... Ok..............");
		         }
		        else{
		         	System.out.println("                                         Invalid Choice... ");
		            }
		            }
				  
				   
				    
				   
		  String testList[] = new String []
		  {
			  
		"TC, DC, HB%, ESR \t  tk 320",
		"TC DC             \t tk 180",
		"HB%               \t tk 180",
	    "ESR               \t tk 150",
        "PCV               \t tk 180",
	    "MCH               \t tk 180",
	    "Platelet          \t tk 160",
	    "RBC               \t tk 180",	
	    "Malarial Parasite (M.P)     \t tk 250",
	    "Blood Film        \t tk 250",
	    "Troponin-I        \t tk 12,000",
	    "Circulating Eosonophil  \t 250",	
	    "BT/CT             \t tk 250",	
	    "Blood Sugar (F/R) \t tk 250",	
	    "1 ½ / 2 hrs. ABF  \t tk 180",
	    "G.T.T. with Urine (2 samples)  \t tk 250",
	    "Urea              \t tk 350",
	    "Creatinine        \t tk 320",	
	    "BUN               \t tk 250",
	    "Uric Acid         \t tk 350",	
	    "Bilirubin         \t tk 350",	
	    "SGPT              \t tk 350",
        "SGOT              \t tk 350",	
	    "Alkaline Phosphatase   \t tk 350",	
	    "S. Cholesterol        \t tk 350",	
	    "Serum HDL        \t tk 350",	
	    "Serum LDL        \t tk 350",	
	    "TG(Triglycerides)\t tk 350",
	    "Lipid Profile    \t tk 1,100",
	    "LDH              \t tk 1,100",
	    "Total Protein    \t tk 250",	
	    "Albumin          \t tk 300",	
	    "Globulin         \t tk 200",
	    "S.Calcium        \t tk 400",
	    "S. Electrolytes (Na, K, Cl) \t tk 650",	
	    "Prothrombin time (PT)       \t tk 450",	
	    "Blood Group + Rh Factor      \t tk 250",	
	    "RA Factor        \t tk 250",	
	    "HBs Ag (Screening)\t tk 400",
	    "HBs Ag (Confirmatory)      \t tk 650"
	};
	
	
	
	
	    System.out.println("                 ======================================================================= ");
		System.out.println("            ====================Please select your test form the list========================");
		System.out.println("                 =======================================================================\n\n\n ");
		System.out.println();
		
		
		
		System.out.println();
		System.out.println();
	
		TestList t1 = new TestList();
		t1.showTest();
		System.out.println();
		System.out.println();
		
		
		int ch =0;
		 trycatch=true;
					while(trycatch)
					{
						try{
							System.out.println("                                     ======================================================================= ");
							System.out.println("                                                      How many test DO you want to take?");
							System.out.print("                                                    >>>>>>");
							
		                    ch = input.nextInt();
							trycatch=false;
				        }
				        catch(InputMismatchException e){
							System.out.println("                           ========================================================================");
							System.out.println("                                               Exception....!!!");
					        System.out.println("                                      Please Input Integer Number.");
							input.next();
							System.out.println("                            ========================================================================");
				        }
					
					}
		
		String showTest[] = new String [ch];
	 

			for(int j = 0; j<ch; j++)
			{
				trycatch=true;
				int choose=0;
				while(trycatch)
					{
						try{
							
								
							 System.out.println("                    ========================================================================"); 
							 System.out.println("                                    Please choose your test");
							 for(;;)
							 {
								 
									System.out.print("                        >>>>>>");
			                        choose = input.nextInt();
							        System.out.println("                     ========================================================================");
									if(choose>=0&&choose<=40){
							       trycatch=false; 
								   break;
								 }
								 else{
									 System.out.println("                    .........................................Not Found........................ ");
								 }
							 
							}
				        }
				        catch(InputMismatchException e){
							System.out.println("                      ========================================================================");
							System.out.println("                                                 Exception....!!!");
					        System.out.println("                                            Please Input Integer Number.");
							input.next();
							System.out.println("                      ========================================================================");
				        }
					
					}
				
				
				 
			
			     System.out.println(testList[choose]);
		
				 showTest[j]= testList[choose];
			
			}
			
			
			
			
			
			
                 SelectTest s =  new SelectTest();
				 s.setFullName(fullName);
				 s.setAge(age);
				 s.setPhoneNumber(phoneNumber);
				 s.setEmail(email);
				 s.setAddress(address); 
		         s.setSize(ch);
                 s.setArray(showTest);
				  p.insertSelectTest(s);
				
				
				Invoice in = new Invoice();
				in.setFullName(fullName);
				in.setAge(age);
				in.setPhoneNumber(phoneNumber);
				in.setEmail(email);
				in.setAddress(address); 
				in.setSize(ch);
				in.setArray(showTest);
				in.Amount();
				
				
				
				System.out.println("\n\n.............................................................\n");
				
				//case 1 End...........................
				
				 for(;;)
		        {
		         System.out.println("                                         |||||||||||||||||||||||||||");
		         System.out.println("                                         || For Next Page Press (n or N)|| ");
		         System.out.println("                                         || To Stay Here (S or s) ||");
		         System.out.print("                                           || Enter your choice:  ");
		         cl = input.next().charAt(0);
		         System.out.print("||\n                                       ||||||||||||||||||||||||||||");
	        	if(cl=='N'||cl=='n')
		         {
		         	clear.clrscr();
			        break;
		         }
		        else if(cl=='S'||cl=='s')
		         {
		        	System.out.println("                                ............... Ok..............");
		         }
		        else{
		         	System.out.println("                                         Invalid Choice... ");
		            }
		            }
				
				   case22 = true;
					break;
					
					case 2:
					
					System.out.println("                                                                                        ====================================  ");
			        System.out.println("                                                                                        ||||||||||| PATIENT  LIST ||||||||||     ");
			        System.out.println("                                                                                        ==================================== \n\n\n");
					p.showAllPatientForm();
					System.out.println("\n\n.............................................................\n");
					 for(;;)
		        {
		         System.out.println("                                         |||||||||||||||||||||||||||");
		         System.out.println("                                         || For Next Page( SECLECT TEST) Press (n or N)|| ");
		         System.out.println("                                         || To Stay Here (S or s) ||");
		         System.out.print("                                           || Enter your choice:  ");
		         cl = input.next().charAt(0);
		         System.out.print("||\n                                       ||||||||||||||||||||||||||||");
	        	if(cl=='N'||cl=='n')
		         {
		         	clear.clrscr();
			        break;
		         }
		        else if(cl=='S'||cl=='s')
		         {
		        	System.out.println("                                ............... Ok..............");
		         }
		        else{
		         	System.out.println("                                         Invalid Choice... ");
		            }
		            }
					case22 = true;
				    break;
					
					
					case 3:
					
					System.out.println("                                                                                        ====================================  ");
			        System.out.println("                                                                                        |||||||||||  Invoice List ||||||||||     ");
			        System.out.println("                                                                                        ==================================== \n\n\n");
					p.showAllSelectTest();
					System.out.println("\n\n.............................................................\n");
					 for(;;)
		        {
		         System.out.println("                                         |||||||||||||||||||||||||||");
		         System.out.println("                                         || For Next Page( SECLECT TEST) Press (n or N)|| ");
		         System.out.println("                                         || To Stay Here (S or s) ||");
		         System.out.print("                                           || Enter your choice:  ");
		         cl = input.next().charAt(0);
		         System.out.print("||\n                                       ||||||||||||||||||||||||||||");
	        	if(cl=='N'||cl=='n')
		         {
		         	clear.clrscr();
			        break;
		         }
		        else if(cl=='S'||cl=='s')
		         {
		        	System.out.println("                                ............... Ok..............");
		         }
		        else{
		         	System.out.println("                                         Invalid Choice... ");
		            }
		            }
					case22 = true;
					break;
					
					
					case 4:
					System.out.println("\n\n========================================================\n\n");
					clear.clrscr();
					case22=false;
					break;
					
					
				  default:
			      System.out.println("Invalid Input");
				  System.out.println("\n\n========================================================\n\n");
				  case22 = true;
			      break;
					
					
				}//switch End
				
				 if(case22==false)
				{break;}
				
				}	// loop End
				
				
				
			   break;
			   
			   
			   
			   //case 3 Start..............
			   
			
			  case 3: // Sign up case 
			   System.out.println("\n                                                                      =================================================\n\n");
			   System.out.println("                                                                        |||||||||||||||||  SIGN UP ||||||||||||||||||||||      ");
			   System.out.println("\n                                                                      =================================================\n\n");
			  boolean count = true;
	        
		      while(true)
			  {
				  
			      System.out.println("                  ===============================================");
				  System.out.println("                  ###### Please fill up the given form  ########         ");
		          System.out.println("                  ===============================================");
				  
				  System.out.println("                  =================================================");
		          System.out.print("                    || User name      :_ ");
	              userName = input.next();
				  System.out.println("                  =================================================\n");
		
		          System.out.println("                  =================================================");
		          System.out.print("                    || Email          :_ ");
	              email = input.next();
			      System.out.println("                  =================================================\n");
				  
				  
	 		      System.out.println("                  =================================================");
		          System.out.print("                    || Password        :_ ");
	              password = input.next();
				  System.out.println("                  =================================================\n");
		
		          System.out.println("                  =================================================");
		          System.out.print("                    ||Confirm password :_ ");
		          String confirmpassword = input.next();
				  System.out.println("                  =================================================");
				  if(userName.equals(password))
					  {
						  System.out.println("   \n###  Password and User name can not be same ###");
		              }
			      else if(password.equals(confirmpassword))
			          {
                        //file1.writeInFile("User name:"+userName+"\nEmail :"+email"\n Password :"+password);
						  
						  System.out.println("      *********************");
				          System.out.println("      *  access granted    *");
						  System.out.println("      **********************");
			              count = false;
			              break;
				 
		              }
			 
		          else
					  {
						  System.out.println("      ******************");
						  System.out.println("      * access denied  *");
						  System.out.println("      ******************");
		              }
					  
		       }// End of loop
			   
			    UserList u = new UserList();
			    u.setUserName(userName);
			    u.setPassword(password);
			    u.setEmail(email);
			
			    p.insertUserList(u);
				ulogin.insertUserList(u);
				
			    file2.writeInFile("User name:"+userName+"\nEmail :"+email+"Password : "+password);
				
				
				System.out.println("                                           ==================================================");
			    System.out.println("                                           =================SignUp Successful================");
				System.out.println("                                           ==================================================\n\n");
			    System.out.println("          ||||||||||Detail|||||||:");
				p.showAllUserList();
				System.out.println("\n\n");
				 
			    System.out.println("================||==============\n\n");
				for(;;)
		        {
		         System.out.println("                                         |||||||||||||||||||||||||||");
		         System.out.println("                                         || For Next Page (n or N)|| ");
		         System.out.println("                                         || To Stay Here (S or s) ||");
		         System.out.print("                                           || Enter your choice:  ");
		         cl = input.next().charAt(0);
		         System.out.print("||\n                                       ||||||||||||||||||||||||||||");
	        	if(cl=='N'||cl=='n')
		         {
		         	clear.clrscr();
			        break;
		         }
		        else if(cl=='S'||cl=='s')
		         {
		        	System.out.println("                                ............... Ok..............");
		         }
		        else{
		         	System.out.println("                                         Invalid Choice... ");
		            }
		            }
				
				
			
		    	break;
			
			   case 4: // Csae 4 Exit point
			   System.out.println("                                 ========================================================================");
			   System.out.println("                                 ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			   System.out.println("                                 |||||||||||||||Thank you for using Pathology Managment||||||||||||||||||");
			   System.out.println("                                 ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			   System.out.println("                                 ========================================================================");
			   y = false;
			   break;
			
			
			  default:
			  System.out.println("             ||||||||||||||||||:");
			  System.out.println("             || Invalid Input||");
			  System.out.println("             ||||||||||||||||||:");
			  break;
			
		
	         } // End of Switch
		
			
	
		
        } // end of main choice while
		
		
		
    } // End of Main Method
}// End of Class


	
	
	
