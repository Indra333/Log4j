package com.epam.SI_and_CI;
import java.util.*;
import org.apache.log4j.Logger;
public class SimpleAndCompoundInterestMain 
{
    private static Scanner sc;
    static final Logger logger=Logger.getLogger("SimpleAndCompoundInterestMain.class");
	public static void main( String[] args )
    {
		logger.info("Simple And CompoundInterest Main class");
    	sc = new Scanner(System.in);
    	System.out.println("1. Simple Interest");
    	System.out.println("2. Compound Interest\n");
    	System.out.println("Enter your choice: ");
    	int choice=sc.nextInt();
    	
    	if(choice==1) {    	
    	System.out.print("Enter Principle Amount: ");
    	double principle=sc.nextDouble();
    	System.out.print("Enter time period: ");
    	double time=sc.nextDouble();
    	System.out.print("Enter Rate Of Interest: ");
    	double ROI=sc.nextDouble();
        SimpleAndCompoundInterest sici=new SimpleAndCompoundInterest();
        double amount=sici.calSimpleInterest(principle,time,ROI);//2500.00,3.5,10.35 principle, no.of times time periods, rate of interest.
        System.out.println("simple interest: "+amount+" Rupees");
    	}
    	
    	
    	else if(choice == 2) {
    		
    		System.out.print("Enter Principle Amount: ");
        	double principle=sc.nextDouble();
        	System.out.print("Enter Rate Of Interest: ");
        	double ROI=sc.nextDouble();
        	System.out.print("Enter no.of times interest applied: ");
        	double NOTIA=sc.nextDouble();
        	System.out.print("Enter time period: ");
        	double time=sc.nextDouble();
        	
        SimpleAndCompoundInterest sici=new SimpleAndCompoundInterest();
        double amount=sici.calCompoundInterest(principle,ROI,NOTIA,time);// 2500.00, 10.35, 10, 1.5 principle, rate of interest, no.of times interest applied, no.of times time periods.
        System.out.println("Compound interest: "+amount+" Rupees");
    	}
    	
    	else {
    		System.out.println("Entered Invalid choice\n");
    	}
    }
}
