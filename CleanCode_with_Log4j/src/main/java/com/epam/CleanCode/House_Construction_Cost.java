package com.epam.CleanCode;

import org.apache.log4j.Logger;

public class House_Construction_Cost {
	static final Logger logger=Logger.getLogger("House_Construction_Cost.class");
	public double House_Construction_Cost1(int area_of_land, String material_standard) {
		if(material_standard=="Standard") {
			logger.info("Area of land is "+area_of_land+"sq.m and material type is Standard");
			double cost=area_of_land*1200;
			logger.info("Cost of construction for given parameters is: "+cost+" Rupees.");
			return cost;
		}
		else{
			logger.info("Area of land is "+area_of_land+"sq.m and material type is Above Standard");
			double cost=area_of_land*1500;
			logger.info("Cost of construction for given parameters is: "+cost+" Rupees.");
			return cost;
		}
	}
	
	public double House_Construction_Cost2(int area_of_land, String material_standard, String fully_Automated) {
		double cost=0;
		if(material_standard=="High Standard" && fully_Automated=="yes") {
			logger.info("Area of land is "+area_of_land+"sq.m and material type is High Standatd and Fully Automated House.");
			cost=area_of_land*2500;
			logger.info("Cost of construction for given parameters is: "+cost+" Rupees.");
		}
		else if(material_standard=="High Standard" && fully_Automated=="no"){
			logger.info("Area of land is "+area_of_land+"sq.m and material type is High Standatd and Not Fully Automated House.");
			cost=area_of_land*1800;
			logger.info("Cost of construction for given parameters is: "+cost+" Rupees.");
		}
		return cost;
	}
	
}
