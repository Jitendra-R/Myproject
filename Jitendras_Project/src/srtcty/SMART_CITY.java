package srtcty;

import java.util.Scanner;
public class SMART_CITY {

	public void smart()// throws Exception
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("*****welcome to smart_city*****");
		System.out.println("1.AIRLINE_RESERVATION\n2.FOOD_DELIVERY\n3.SHOPPING\n4.TRANSPORTATION\n5.EXIT");
		System.out.println("select any one");
		int o=sc.nextInt();
		
		switch(o)
		{
		case 1:
			AIRLINE a=new AIRLINE();
			a.airline();
			break;
			
		case 2:
			FOODDELIVERY h=new FOODDELIVERY();
			h.food();
			break;
			
		case 3:
			SHOPPING_MAIN S=new SHOPPING_MAIN();
			S.shop();
			break;
			
		case 4:
			TRANSPORTATIONMAIN t=new TRANSPORTATIONMAIN();
			t.transport();
			break;
			
		case 5:
			System.exit(0);
			
		}

	 }
	}
	public static void main(String args[])//throws Exception
	{
		SMART_CITY SM=new SMART_CITY();
		SM.smart();
	}

}

