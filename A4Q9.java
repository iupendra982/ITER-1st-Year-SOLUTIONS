/*
Write a java program to take an integer input from the user and print the input by removing all
zeros.
Example: Input = 10200 then Output = 12.
Sample run:
Enter an integer number: 10203040
After removing 0 from number 10203040, the new number is 1234.  
*/




import java.util.*;
public class A4Q9 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer number");
	int n=sc.nextInt();
	int index=0;
	int new_number=0;
	while(n>0) {
	int remainder=n%10;
	n=n/10;
	if(remainder!=0) 
	{
		new_number=new_number+ (int)(remainder*Math.pow(10, index));
		index++;
	}
}
	System.out.println("The new number is :"+new_number);
  }
}
