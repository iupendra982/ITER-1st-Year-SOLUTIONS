/*
From the above question no. (6) write a java program with a choice if the consumer
wants to pay bill online. Consumer who pays their electricity bill online will get a
discount of 3%.
Here is the sample output:
No. of units consumed: 867
Do you want to pay online(y/n): y
Total amount: 4925.4
Discount: 147.762
Amount payable: 4777.638
 */

 import java.util.*;
public class A3Q7 {

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
	
	System.out.println("Do you want to pay online (y/n)");
	char choice=sc.next().charAt(0);
	
	switch(choice) {
	case 'y' :{double discount= bill*3/100.0;
	double New_bill=bill-discount;
	System.out.println("Your Discount is Rs. "+discount);
	System.out.println("You have to pay Rs. "+bill);
	break;
	}
	case 'n' :{System.out.println("You have to pay Rs. "+bill);
	break;
	
	}
	}

	}

}