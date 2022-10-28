package srtcty;

import java.util.Scanner;
public class SHOPPING_MAIN {

	public void shop() //throws Exception
	{
		SHOPPING_CART sh=new SHOPPING_CART();
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("1.GROCERY\n2.ELECTRONICS\n3.FOOTWEAR\n4.INVOICE\n5.EXIT");
		System.out.println("select any one");
		int op=s.nextInt();
		
		switch(op)
		{
		case 1:
			sh.grocery();
			break;
			
		case 2:
			sh.electric();
			break;
			
		case 3:
			sh.footwear();
			break;
			
		case 4:
			sh.invoice();
			break;
			
		case 5:
			SMART_CITY SM=new SMART_CITY();
			SM.smart();
		  break;
		  
		default:
			System.out.println("you have entered wrong input");
			break;
			
			
		}

	}

}
}