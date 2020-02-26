package com.epam.CleanCode;
import java.util.*;
import org.apache.log4j.Logger;
public class HCC_main {
private static Scanner sc;
static final Logger logger=Logger.getLogger("HCC_main.class");
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the area in sq.m: ");
		int area_of_land= sc.nextInt();
		System.out.println("materials type:");
		System.out.println("1.Standard  materials");
		System.out.println("2.Above Standard  materials");
		System.out.println("3.High Standard  materials");
		System.out.print("\nchoose your material type: ");
		int choice=sc.nextInt();
		String material_standard;
		if(choice==1) {
			material_standard="Standard";
			House_Construction_Cost cost=new House_Construction_Cost();
			System.out.println("Total cost: "+ cost.House_Construction_Cost1(area_of_land,material_standard));
		}
		else if(choice==2) {
			material_standard="Above Standard";
			House_Construction_Cost cost=new House_Construction_Cost();
			System.out.println("Total cost: "+ cost.House_Construction_Cost1(area_of_land,material_standard));
		}
		else if(choice==3) {
			material_standard="High Standard";
			System.out.println("Fully Automated:");
			System.out.println("1.Yes");
			System.out.println("2.No");
			System.out.println("choose valied option for Automation: ");
			int Auto_choise=sc.nextInt();
			String Fully_Automated;
			if(Auto_choise==1) {
				Fully_Automated="yes";
				House_Construction_Cost cost=new House_Construction_Cost();
				System.out.println("Total cost: "+ cost.House_Construction_Cost2(area_of_land,material_standard,Fully_Automated));
			}
			else if(Auto_choise==2) {
				Fully_Automated="no";
				House_Construction_Cost cost=new House_Construction_Cost();
				System.out.println("Total cost: "+ cost.House_Construction_Cost2(area_of_land,material_standard,Fully_Automated));
			}
		}
		else {
			System.out.println("you have chosen wrong option");
		}
		
		
		
		
	}
}
