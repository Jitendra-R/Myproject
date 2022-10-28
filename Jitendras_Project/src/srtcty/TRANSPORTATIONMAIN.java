package srtcty;

import java.util.Scanner;

public class TRANSPORTATIONMAIN {

	public void transport()// throws Exception
	{
		Scanner sc=new Scanner(System.in);
		 System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        TRANSPORTATIONDETAILS T[] = new TRANSPORTATIONDETAILS[n];  
	        for (int i = 0; i < T.length; i++) 
	        {  
	            T[i] = new TRANSPORTATIONDETAILS();  
	            T[i].reg();  
	        } 
	        int ch;
	        do {  
	            System.out.println("**WELCOME TO SCUBER_RIDE**");  
	            System.out.println("1.AUTO\n 2.BIKE\n 3.CAR\n 4.Display all visitors\n 5.Exit ");  
	            System.out.println("Select Any one Transportation type: ");  
	            ch = sc.nextInt();  
	                switch (ch) 
	                {	  
	                case 1:  
                        System.out.print("Enter phone no of the visitor: ");  
                        long phn_num = sc.nextLong();  
                        boolean found = false;  
                        for (int i = 0; i < T.length; i++) {  
                            found = T[i].search(phn_num);  
                            if (found) { 
                            	T[i].car();
                                break;  
                            }  
                        }  
                        if (!found) 
                        {  
                            System.out.println("Search failed! Visitor doesn't exist..!!");  
                        }  
                        break;
                        
	                case 2:
	                	 System.out.print("Enter Phone No : ");  
	                        phn_num = sc.nextLong();  
	                        found = false;  
	                        for (int i = 0; i < T.length; i++) {  
	                            found = T[i].search(phn_num);  
	                            if (found) {  
	                                T[i].bike();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Visitor doesn't exist..!!");  
	                        }  
	                        break; 
	                case 3:
	                        System.out.print("Enter Phone No : ");  
	                        phn_num = sc.nextLong();  
	                        found = false;  
	                        for (int i = 0; i < T.length; i++) {  
	                            found = T[i].search(phn_num);  
	                            if (found) {  
	                                T[i].car();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Visitor doesn't exist..!!");  
	                        }  
	                        break;
	                        
	                case 4:
	                	 for (int i = 0; i < T.length; i++) 
		         	        {  
		         	           T[i].login();
		         	        } 
		                  break;
		                  
	                case 5:
	                	SMART_CITY SM=new SMART_CITY();
	    				SM.smart();
	    				break;
	       } 
    }while(ch!=5);
}
}

