/*Write a java program to calculate the monthly electricity bill. The tariff is given as
follows:
Price per unit Unit range 

Rs. 3/   - First 50 units
Rs. 4.80/- 50-200 units
Rs. 5.80/- 200-400 units
Rs. 6.20/- Above 400 units

 */

 import java.util.*;
public class A3Q6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your power consumption unit:");
	int unit=sc.nextInt();
	double bill;
	
	if(unit<=50)
	{
		bill=unit*3;
		System.out.println("You have to pay Rs. "+bill);
	}
	else if(unit<=200)
	{
		bill= (50*3) + (unit-50)*4.8;
		System.out.println("You have to pay Rs. "+bill);
	}
	else if(unit<=400)
	{
		bill=(50*3) + (150*4.8) + (unit-200)*5.80;
		System.out.println("You have to pay Rs. "+bill);
	}
	else
	{
		bill=(50*3) + (150*4.8) + (200*5.80) + (unit-400)*6.20;
		System.out.println("You have to pay Rs. "+bill);
	}

	}

}
