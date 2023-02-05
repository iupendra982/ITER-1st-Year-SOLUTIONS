/*
Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's
algorithm, which is an iterative computation based on the following observation: if y divides
x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
Sample run:
Enter the first number: 56
Enter the second number: 98
GCD of 56 and 98 is 14. 
*/

import java.util.*;
public class A4Q4 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a=sc.nextInt();
        System.out.println("Enter the second number : ");
        int b=sc.nextInt();
        int a1=a;
		int b1=b;
		int r=0;
		while(a%b!=0) 
		{
			r=a%b;
			a=b;
			b=r;
		}
		System.out.println("GCD of "+a1+" and "+b1+" is :"+r);
    }
    
}
