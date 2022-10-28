package srtcty;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SHOPPING_CART 
{
	 String productname,productname2,productname3;
	 String comapanyname,comapanyname2,companyname3;
	 int quantity,quantity2,quantity3;
	 long cost,cost2,cost3;
	 long totalcost;
	 
	
	SHOPPING S1=new SHOPPING();
	SHOPPING s2=new SHOPPING();
	SHOPPING s3=new SHOPPING();
	
	public void grocery()
	{
		String search;
		try {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the name of item ");
		search=s.nextLine();
		
		if(search.startsWith("oil"))
		{
			S1.setProductname(search);
			S1.setComapanyname("Freedom");
			System.out.println("enter the quantity");
			quantity=s.nextInt();
			S1.setQuantity(quantity);
			cost=180*S1.getQuantity();
			S1.setCost(cost);
			
		}
		else if(search.startsWith("sugar"))
		{
			S1.setProductname2(search);
			S1.setComapanyname2("Dhampur");
			System.out.println("enter the quantity in kg");
			quantity2=s.nextInt();
			S1.setQuantity2(quantity2);
			cost2=40*S1.getQuantity2();
			S1.setCost2(cost3);
			
		}
		else if(search.startsWith("salt"))
		{
			S1.setProductname3(search);
			S1.setCompanyname3("Ashirvad");
			System.out.println("enter the quantity in kg");
			quantity3=s.nextInt();
			S1.setQuantity3(quantity3);
			cost3=20*S1.getQuantity3();
			S1.setCost3(cost3);
			
		}
		else
		{
			System.out.println("oops not found");
		}
	}
		catch(InputMismatchException e)
		{
			System.out.println("you have entered wrong type of data");
			SHOPPING_CART sh=new SHOPPING_CART();
			sh.grocery();
			
		}	
		
	}
	
	public void electric()
	{
		String search1;
		try
		{
		Scanner k=new Scanner(System.in);
		 System.out.println("welcome to Electronics section");
		   System.out.println("search your items here");
		   search1=k.nextLine();
		   if(search1.equals("mobile"))
		   {
			   s2.setProductname(search1);
			   s2.setComapanyname("SAMSUNG");
			  System.out.println("enter your quantity");
			  quantity=k.nextInt();
			  s2.setQuantity(quantity);
			  cost=50000;
			  s2.setCost(cost*s2.getQuantity());
			  
		   }
		   else if(search1.equals("laptop"))
		   {
			   s2.setProductname2(search1);
			   s2.setComapanyname2("Dell");
			   System.out.println("enter your quantity");
			   quantity2=k.nextInt();
			   s2.setQuantity2(quantity2);
			   cost2=35000;
			   s2.setCost2(cost2*s2.getQuantity2());
			  
			 
		   }
		   else if(search1.equals("mouse"))
		   {
			   s2.setProductname3(search1);
			   s2.setCompanyname3("ZEBRONICS");
			   System.out.println("enter your quantity");
			   quantity3=k.nextInt();
			   s2.setQuantity3(quantity3);
			   cost3=500;
			   s2.setCost3(cost3*s2.getQuantity3());
			  	  
		   }
		}
		catch(InputMismatchException e)
		{
			System.out.println("enter correct data");
			SHOPPING_CART sh=new SHOPPING_CART();
			sh.electric();
		}
	}
	public void footwear()
	{
		int size;
		String search2;
		Scanner sc=new Scanner(System.in);
		try
		{
		  System.out.println("welcome to Footwear section");
		   System.out.println("search your items here");
		   search2=sc.nextLine();
		   if(search2.equals("shoes"))
		   {
			   s3.setProductname(search2);
			   s3.setComapanyname("Nike");
			   System.out.println("enter your size");
			   size=sc.nextInt();
			   System.out.println("enter your quantity");
			   quantity=sc.nextInt();
			   s3.setQuantity(quantity);
			   cost=500;
			   s3.setCost(cost*s3.getQuantity());

		   }
		   else if(search2.equals("sandals"))
		   {
			   s3.setProductname2(search2);
			   s3.setComapanyname2("Walkmate");
			   System.out.println("enter your size");
			   size=sc.nextInt();
			   System.out.println("enter your quantity");
			   quantity2=sc.nextInt();
			   s3.setQuantity2(quantity2);
			   cost2=500;
			   s3.setCost2(cost*s3.getQuantity2());

		   }
		   else if(search2.equals("slippers"))
		   {
			   s3.setProductname3(search2);
			   s3.setCompanyname3("Paragone");
			   System.out.println("enter your size");
			   size=sc.nextInt();
			   System.out.println("enter your quantity");
			   quantity3=sc.nextInt();
			   s3.setQuantity3(quantity3);
			   cost3=500;
			   s3.setCost3(cost*s3.getQuantity3());

		   }
		   else
		   {
			   System.out.println("oops not found");
		   }
		  	   
	}
		catch(InputMismatchException e)
		{
			System.out.println("enter correct input type to select");
			SHOPPING_CART sh=new SHOPPING_CART();
			sh.footwear();
		}
	
	}
	
	public void invoice()
	{
		totalcost=S1.getCost()+S1.getCost2()+S1.getCost3()+s2.getCost()+s2.getCost2()+s2.getCost3()+s3.getCost()+s3.getCost2()+s3.getCost3();
		S1.setTotalcost(totalcost);
		System.out.println("grocery item");
		System.out.println("product 1"+S1.getProductname()+" "+S1.getComapanyname()+" "+S1.getQuantity()+" $ "+S1.getCost());
		System.out.println("product 2"+S1.getProductname2()+" "+S1.getComapanyname2()+" "+S1.getQuantity2()+" $ "+S1.getCost2());
		System.out.println("product 3"+S1.getProductname3()+" "+S1.getCompanyname3()+" "+S1.getQuantity3()+" $ "+S1.getCost3());
		System.out.println("Electronics item");
		System.out.println("product 1"+s2.getProductname()+" "+s2.getComapanyname()+" "+s2.getQuantity()+" $ "+s2.getCost());
		System.out.println("product 2"+s2.getProductname2()+" "+s2.getComapanyname2()+" "+s2.getQuantity2()+" $ "+s2.getCost2());
		System.out.println("product 3"+s2.getProductname3()+" "+s2.getCompanyname3()+" "+s2.getQuantity3()+" $ "+s2.getCost3());
		System.out.println("Foot Wear");
		System.out.println("product 1"+s3.getProductname()+" "+s3.getComapanyname()+" "+s3.getQuantity()+" $ "+s3.getCost());
		System.out.println("product 2"+s3.getProductname2()+" "+s3.getComapanyname2()+" "+s3.getQuantity2()+" $ "+s3.getCost2());
		System.out.println("product 3"+s3.getProductname3()+" "+s3.getCompanyname3()+" "+s3.getQuantity3()+" $ "+s3.getCost3());
		System.out.println("TOTAL_COST="+S1.getTotalcost());
	}

}