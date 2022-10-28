package srtcty;
import java.util.Scanner;
public class TRANSPORTATIONDETAILS implements  TRANSPORTATION
{
	private String name;
	private String source;
	private String destination;
	private String email;
	private int otp;
	private long phone;
	private long pay;
	String num;
	Scanner sc=new Scanner(System.in);
	
	public void reg()
	{
		 System.out.println("enter name");
		 name=sc.nextLine();
		 System.out.println("enter email");
		 email=sc.nextLine();
		 System.out.println("enter phone number");
		 phone=sc.nextLong();
		
	}
	public void car()
	{
		 System.out.println("enter source");
		 source=sc.next();
		 System.out.println("enter destination");
		 destination=sc.next(); 
		 
		 if(source.startsWith("upp") && destination.startsWith("dil"))
		 {
			 pay=280;
			 num="TS1010BA8974";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
		 
	 else if(source.startsWith("nag") && destination.startsWith("dil"))
		 {
			 pay=200;
			 num="TS1010BA8874";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
	
	 else if(source.startsWith("ko") && destination.startsWith("dil"))
		 {
			 pay=120;
			 num="TS1010BA8974";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
	}
	public void bike()
	{
		 System.out.println("enter source");
		 source=sc.next();
		 System.out.println("enter destination");
		 destination=sc.next();
		 
		 if(source.startsWith("upp") && destination.startsWith("dil"))
		 {
			 pay=200;
			 num="TS1010BA8974";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
		 
	 else if(source.startsWith("nag") && destination.startsWith("dil"))
		 {
			 pay=150;
			 num="TS1010BA8874";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
	
	 else if(source.startsWith("ko") && destination.startsWith("dil"))
		 {
			 pay=100;
			 num="TS1010BA8974";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
	}
	public void auto()
	{
		 System.out.println("enter source");
		 source=sc.next();
		 System.out.println("enter destination");
		 destination=sc.next();
		 
		 if(source.startsWith("upp") && destination.startsWith("dil"))
		 {
			 pay=200;
			 num="TS1010BA8974";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
		 
	 else if(source.startsWith("nag") && destination.startsWith("dil"))
		 {
			 pay=150;
			 num="TS1010BA8874";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
	
	 else if(source.startsWith("ko") && destination.startsWith("dil"))
		 {
			 pay=100;
			 num="TS1010BA8974";
			 System.out.println("your ride was booked Cab number="+num);
			 System.out.println("enter a otp generated to your Registered Number");
			 otp=sc.nextInt();
			 if(true)
			 {
			   System.out.println("location has been reached");
			   System.out.println("Total charges="+pay);
			 }
		 }
	}
	public void log()
	{
		System.out.println("Customer name :"+name);
	}
	public void login()
	{
		System.out.println("Customer name :"+name);
		System.out.println("EMAIL_ID :"+email);
		System.out.println("PHONE_NUM :"+phone);
		System.out.println("SOURCE :"+source);
		System.out.println("DESTINATION :"+destination);
		System.out.println("COST :"+pay);
	}
	public boolean search(long phn_num) {  
        if (phone==phn_num) {  
            log();  
            return (true);  
        }  
        return (false);  
    }  

}

