package srtcty;
import java.util.ArrayList;
import java.util.Scanner;


public class FOODDELIVERY
{
	byte chb,chl,chf,chs;
	ArrayList<String> Name=new ArrayList<String>();
	ArrayList<String> Address=new ArrayList<String>();
	ArrayList<String> Biryani=new ArrayList<String>();
	ArrayList<String> Fastfood=new ArrayList<String>();
	ArrayList<String> Lassi=new ArrayList<String>();
	ArrayList<String> Starters=new ArrayList<String>();
	ArrayList<String> Restaurant=new ArrayList<String>();
	ArrayList<String> Phonenum=new ArrayList<String>();
	ArrayList<String> Customerpswd=new ArrayList<String>();
	ArrayList<Integer> CostB=new ArrayList<Integer>();
	ArrayList<Integer> CostL=new ArrayList<Integer>();
	ArrayList<Integer> CostF=new ArrayList<Integer>();
	ArrayList<Integer> CostS=new ArrayList<Integer>();
	
	ArrayList<String> CustomerNameBooking=new ArrayList<String>();
	ArrayList<String> CustomerGenderBooking=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
	public void add()
	{
		Restaurant.add("Bawarchi");
		Restaurant.add("Paradise");
		Restaurant.add("Mehfil");
		Restaurant.add("Kritunga");
		Restaurant.add("Cafe Bahar");
		Restaurant.add("Lucky");
		
		
		Biryani.add("Chicken Biryani");
		Biryani.add("Mutton Biryani");
		Biryani.add("Prawns Biryani");
		Biryani.add("Kimma Biryani");
		
		CostB.add(250);
		CostB.add(270);
		CostB.add(280);
		CostB.add(320);
		
		
		Lassi.add("Fruit salad");
		Lassi.add("Almond Lassi");
		Lassi.add("Fruit mix Lassi");
		CostL.add(100);
		CostL.add(120);
		CostL.add(110);
	   
		
		Starters.add("Chicken Lollipop");
		Starters.add("Chicken Drumstick");
		Starters.add("Chicken Kabab");
		CostS.add(220);
		CostS.add(230);
		CostS.add(240);
	
		Fastfood.add("Chicken Manchuria");
		Fastfood.add("Chicken Noodles");
		Fastfood.add("Chicken Friedrice");
		Fastfood.add("veg noodles");
		Fastfood.add("veg Friedrice");
		Fastfood.add("veg Manchuria");
		CostF.add(120);
		CostF.add(120);
		CostF.add(110);
		CostF.add(100);
		CostF.add(100);
		CostF.add(90);
	}
	public void admin()
	{
		System.out.println("WELCOME ADMIN");
		System.out.println("1.Available Restaurant\n2.Registeres Customers\n3.Customer Details");
	    byte ch=sc.nextByte();
	    
	    switch(ch)
	    {
	    case 1:
	    	for(int i=0;i<Restaurant.size();i++)
	    	{
	    		System.out.println(Restaurant.get(i));
	    	}
	    	break;
	    	
	    case 2:
	    	for(int i=0;i<Name.size();i++)
	    	{
	    		System.out.println((i+1)+" "+Name.get(i));
	    	}
	    	break;
	    	
	    case 3:
	    	for(int i=0;i<Name.size();i++)
	    	{
	    		System.out.println("Name"+". "+Name.get(i));
				System.out.println("Address"+". "+Address.get(i));
				System.out.println("Phone Number"+". "+Phonenum.get(i));
	    	}
	    	break;
	    	
	    }
		
	}
	public void customer()
	{
		System.out.println("welcome to customer portal");
		System.out.println("1.Login \t 2.Registration\n");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				if(Phonenum.isEmpty())
				{
					System.out.println("First register yourself then login..!");
					break;
				}
				else
				{
					customerLogin();
					
				}
				
				break;
			case 2:
				Registration();
				break;
			

	}
  }
	public void customerLogin()
	{
		System.out.println("****welcome to login page****");
		System.out.println("Enter your (mobilenumber)");
		String mobileNumber=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		boolean flag1=false;
		byte ch;
		
		int j;
		for( j=0; j<Phonenum.size();j++)
		{
			
			if((Phonenum.get(j)).contains(mobileNumber)&&(Customerpswd.get(j)).contains(password))
			{
				flag1=true;

				break;
			}
			
		}
		
			if(flag1==true)
			{
				System.out.println("Book Fooditem");
				System.out.println("\n Welcome "+Name.get(j)+",too book Fooditem choose your restaurant..");
				for(int i=0; i<Restaurant.size(); i++)
				{
					System.out.println((i+1)+". "+Restaurant.get(i));
				}
				byte choicer=sc.nextByte();
				
				do
				{   System.out.println("**********MENU*********");
					System.out.println("1.Biryani\n2.Starters\n3.Lassi\n4.Fastfood\n5.Exit");
				     ch=sc.nextByte();
					switch(ch)
					{
					case 1:
						System.out.println("*****BIRYANI_CART ITEMS*****");
						for(int i=0;i<Biryani.size();i++)
						{ 
							
							System.out.println((i+1)+" "+Biryani.get(i));
						}
						System.out.println("select your option");
						chb=sc.nextByte();
						System.out.println("enter your quantity");
						int q=sc.nextInt();
							if(chb<=Biryani.size()-1 && chb>0)
							{
								System.out.println("\n\nFooditem: \t "+Biryani.get(chb-1)+"\nCOST: \t "+CostB.get(chb-1)*q);
							
							}
						
						break;
						
					case 2:
						System.out.println("****STARTERS_CART ITEMS*****");
						for(int i=0;i<Starters.size();i++)
						{
							 
							System.out.println((i+1)+" "+Starters.get(i));
						}
						System.out.println("select your option");
						 chs=sc.nextByte();
						System.out.println("enter your quantity");
						 q=sc.nextInt();
						
							if(chs<=Starters.size()-1 && chs>0)
							{
								System.out.println("\n\nFooditem: \t "+Starters.get(chs-1)+"\nCOST: \t "+CostS.get(chs-1)*q);
							
							}
						
						break;
						
					case 3:
						 System.out.println("****LASSI_CART ITEMS****");
						for(int i=0;i<Lassi.size();i++)
						{
							System.out.println((i+1)+" "+Lassi.get(i));
						}
						System.out.println("select your option");
						 chl=sc.nextByte();
						System.out.println("enter your quantity");
						 q=sc.nextInt();
							if(chl<=Lassi.size()-1 && chl>0)
							{
								System.out.println("\n\nFooditem: \t "+Lassi.get(chl-1)+"\nCOST: \t "+CostL.get(chl-1)*q);
							
							}
					
						break;
						
					case 4:
						  System.out.println("****FASTFOOD_CART ITEMS****");
						for(int i=0;i<Fastfood.size();i++)
						{
							  System.out.println("FASTFOOD_CART ITEMS");
							System.out.println((i+1)+" "+Fastfood.get(i));
						}
						System.out.println("select your option");
						chf=sc.nextByte();
						System.out.println("enter your quantity");
						q=sc.nextInt();
							if(chf<=Fastfood.size()-1 && chf>0)
							{
								System.out.println("\n\nFooditem: \t "+Fastfood.get(chf-1)+"\nCOST: \t "+CostF.get(chf-1)*q);
							
							}
						
						break;
						
					case 5:
						System.out.println("Thanks for ordering");
						break;
						
						
					}
				}while(ch!=5);
			   
				
			}
			else
			{
				System.out.println("enter correct input");
		    }
		
	
	}
	public void Registration()
	{
		int i=0;
		String mobileNumber;
		System.out.println("\n");
		System.out.println("\t\t | Welcome to Customer Registration Page!|");
		System.out.println("\n");
		System.out.println("Please enter your name");
		Name.add(sc.next());
		System.out.println("Enter your Address");
		Address.add(sc.next());
		System.out.println("Please enter your Mobile number");
		mobileNumber=sc.next();
		String mno;
		
		boolean flag=true, flag1=true;
		
		if(Phonenum.isEmpty())
		{
			Phonenum.add((mobileNumber));
			System.out.println("Enter password");
			Customerpswd.add(sc.next());
			System.out.println("Registration is Successfull");
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=Phonenum.size()-1;i++)
			{
				mno=Phonenum.get(i);
				
				if(mno.equals(Phonenum))
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
			Phonenum.add(mobileNumber);
			System.out.println("Enter password");
			Customerpswd.add(sc.next());
			System.out.println("Registration is Successfull.");
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
			}
		}
	}
	public void food()  //throws Exception
	{
		FOODDELIVERY al=new FOODDELIVERY();
		Scanner sh=new Scanner(System.in);
		al.add();
		boolean flag=true;
		while(flag=true)
		{
			
		
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\t\t | Welcome to RESTAURANT ONLINE|");
			System.out.println("----------------------------------------------------------------------\n");
				System.out.println("\n1.Customer\t 2. Admin \t 3. Exit\n");
			int choice=sh.nextInt();
			switch(choice)
			{
				
				case 1:
					al.customer();									
					flag=true;
					break;
					
				case 2:
					al.admin();
					flag= true;
					break;
					
				case 3:
					SMART_CITY SM=new SMART_CITY();
					SM.smart();;

			}
		}
	  }
    }
