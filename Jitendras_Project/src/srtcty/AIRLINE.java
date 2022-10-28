package srtcty;
import java.util.*;
public class AIRLINE
{       ArrayList<String> Availableflights=new ArrayList<String>();
        ArrayList<Long> Cost=new ArrayList<Long>();
        ArrayList<String> Registeredpassenger=new ArrayList<String>();
        ArrayList<String> passengerdetails=new ArrayList<String>();
	
		ArrayList<String> passengerName=new ArrayList<String>();
		ArrayList<String> passengerEmail=new ArrayList<String>();
		ArrayList<String> passengerGender=new ArrayList<String>();
		ArrayList<Integer> passengerAge=new ArrayList<Integer>();
		ArrayList<String> passengerPassword=new ArrayList<String>();
		ArrayList<Long> passengerMobileNumber=new ArrayList<Long>();

		
		ArrayList<String> passengerNameBooking=new ArrayList<String>();
		ArrayList<Integer> passengerAgeBooking=new ArrayList<Integer>();
		ArrayList<String> passengerGenderBooking=new ArrayList<String>();
		ArrayList<Byte> FlightID=new ArrayList<Byte>();

		
  void add()
  {
	  Availableflights.add("DELHI");
	  Availableflights.add("BANGLORE");
	  Availableflights.add("HYDERABAD");
	  Availableflights.add("CHENNAI");
	  Availableflights.add("MUMBAI");
	  Availableflights.add("KOLKATA");
	  
	  
	  Cost.add(7000l);
	  Cost.add(4000l);
	  Cost.add(2000l);
	  Cost.add(3000l);
	  Cost.add(4500l);
	  Cost.add(7500l);
	  

	  
	  
  }
  void admin()
	{
		Scanner sc=new Scanner(System.in);
		byte choice;
		boolean flag=true;

		while(flag)
		{
			
			System.out.println("\t\t  ___");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |       Welcome Admin     |");
			System.out.println("\t\t |___|");
			System.out.print("\n\n1. AVAILABLE FLIGHTS \t2. Registered Passenger \t3.passenger Details  \n\nEnter Your Choice.\n");
			choice=sc.nextByte();
			switch(choice)
			{
			case 1:
				for(int i=0; i<= Availableflights.size()-1; i++)
				{
					System.out.println("Flights: \t "+ Availableflights.get(i));
				
				}
				byte menuCHoice;
				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag=false;
					
				}
				else
				{
					break;
				}

				break;

			case 2:
					if(passengerName.isEmpty())
					{
						System.out.println("No Registered passenger yet.");
						//Thread.sleep(3000);
						break;
					}
					else 
					{
						for(int i=0; i<=passengerName.size()-1; i++)
						{
							System.out.println((i+1)+". "+passengerName.get(i));
						}

						System.out.println("\n\n1. Main menu\t 2. Previous menu");
						menuCHoice=sc.nextByte();
						if(menuCHoice==1)
						{
							flag=false;
							
						}
						else
						{
							break;
						}
					}
					
					break;
				
			case 3:
				if(passengerNameBooking.isEmpty())
				{
					System.out.println("\nNo Booking yet.");
					break;
				}
				
				else
				{
					for(int i=0; i<=passengerNameBooking.size()-1; i++)
					{
						System.out.println((i+1)+"NAME" +passengerNameBooking.get(i));
						System.out.println("AGE"+passengerAgeBooking.get(i));
						System.out.println("GENDER"+passengerGenderBooking.get(i));
						
						
						
					}

					
					flag=false;

				}
				break;
			default:
					System.out.println("Wrong choice");
					//Thread.sleep(1000);
					flag=true;
			}


		}
		
	}
  
  void passenger() 
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			
			System.out.println("\t\t  ___");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Passenger Page!|");
			System.out.println("\t\t |___|");
			System.out.println(" ");
			System.out.println("1.Login \t 2.Registration\n");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(passengerMobileNumber.isEmpty())
					{
						System.out.println("First register yourself then login..!");
						//Thread.sleep(500);
						break;
					}
					else
					{
						passengerLogin();
						flag=false;
						
					}
					
					break;
				case 2:
					passengerRegistration();
					flag=false;
					break;
				

				default:
					System.out.println("\nYou have entered wrong choice. enter your choice again....!!!");
					flag= true;
				
					break;
			}
		}
	}
	void passengerLogin()
	{

		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		long mobileNumber;
		byte choice;
		System.out.println("\t\t  ___");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |         Login 		   |");
		System.out.println("\t\t |___|");

		System.out.println("Enter your (mobilenumber)");
		mobileNumber=sc.nextLong();
		System.out.println("Enter your password");
		String password=sc.next();
	
		
		boolean flag1=false;
		int j;
		for(j=0; j<=passengerMobileNumber.size()-1;j++)
		{
			
			if((passengerMobileNumber.get(j)).equals(mobileNumber)&&(passengerPassword.get(j)).equals(password))
			{
				flag1=true;

				break;
			}
			
		}
		if(flag1==true)
		{		
			
				System.out.println("\t\t  ___");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Flights   |");
				System.out.println("\t\t |___|");
			System.out.println("\n Welcome "+passengerName.get(j)+", to book Flight, choose your destination..");
			
			for(int i=0; i<=Availableflights.size()-1; i++)
			{
				System.out.println((i+1)+". "+Availableflights.get(i));
			}
			choice=sc.nextByte();
			FlightID.add(choice);
			

			
			while(flag)
			{
				
				System.out.println("\t\t  ___");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Flights    |");
				System.out.println("\t\t |___|");
				
				
				for(int i=0; i<=Availableflights.size()-1;i++)
				{
					if(choice<=Availableflights.size() && choice>0)
					{
						System.out.println("\n\nName: \t "+Availableflights.get(choice-1)+"\nCOST: \t "+Cost.get(choice-1));
						System.out.println("\n Enter your name: \t");
						sc.nextLine();
						passengerNameBooking.add(sc.nextLine());
						System.out.println(" Enter your age: \t");
						passengerAgeBooking.add(sc.nextInt());
						System.out.println(" Enter your gender: \t");
						passengerGenderBooking.add(sc.next());

						System.out.println("\n Booking Successfull..");


						flag=false;
						break;
					}
					else 
					{
						System.out.println("\n enter correct input..");
						flag=true;
					}
				
					
				}
			}	

		}
		else 
		{
			System.out.println("Login unsuccessfull..");
			flag=false;
		}
	}
	
	
	void passengerRegistration()
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		System.out.println("\n");
		System.out.println("\t\t | Welcome to Passenger Registration Page!|");
		System.out.println("\n");
		System.out.println("Please enter your name");
		passengerName.add(sc.nextLine());
		System.out.println("enter your age: ");
		passengerAge.add(sc.nextInt());
		System.out.println("Please enter your Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		
		boolean flag=true, flag1=true;
		
		if(passengerMobileNumber.isEmpty())
		{
			passengerMobileNumber.add((mobileNumber));
			System.out.println("Enter password");
			passengerPassword.add(sc.next());
			System.out.println("Registration is Successfull.");

			
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=passengerMobileNumber.size()-1;i++)
			{
				mno=passengerMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
			passengerMobileNumber.add(mobileNumber);
			System.out.println("Enter password");
			passengerPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
		
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
		
			}
		}
	}

	public void airline()  //throws Exception
	{
		AIRLINE al=new AIRLINE();
		Scanner sc=new Scanner(System.in);
		al.add();
		boolean flag=true;
		while(flag=true)
		{

		
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\t\t | Welcome to AIRLINE BOOKING|");
			System.out.println("----------------------------------------------------------------------\n");
				System.out.println("\n1. Passenger \t 2. Admin \t 3. Exit\n");
			int choice=sc.nextInt();
			switch(choice)
			{
				
				case 1:
					al.passenger();										
					flag=true;
					break;
					
				case 2:
					al.admin();
					flag= true;
					break;
					
				default:
					SMART_CITY SM=new SMART_CITY();
					SM.smart();

		}	}
	}
}
