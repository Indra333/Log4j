package com.epam.SI_and_CI;
import org.apache.log4j.Logger;
public class SimpleAndCompoundInterest {
	static final Logger logger=Logger.getLogger("SimpleAndCompoundInterest.class");
	double calSimpleInterest(double principle, double time, double rate_of_interest) {
		double amount=(principle*time*rate_of_interest)/100;
		logger.info("Simple Interest Calculation Method"+"\n principle Amount: "+principle+"\n Time : "+time+"\n Rate of interest: "+rate_of_interest+"\n Simple Interest: "+amount+" Rupees");
		return amount;
	}
	
	double calCompoundInterest(double principle, double rate_of_interest, double no_of_times_interest_applied, double time_period) {
		double amount=principle*(Math.pow(1+(rate_of_interest/no_of_times_interest_applied),(no_of_times_interest_applied * time_period)));
		logger.info("Compound Interest Calculation Method"+"\n principle Amount: "+principle+"\n No Of Times Interest Applied: "+no_of_times_interest_applied+"\n Time : "+time_period+"\n Rate of interest: "+rate_of_interest+"\n Compound Interest: "+amount+" Rupees");
		return amount;
	}
}
