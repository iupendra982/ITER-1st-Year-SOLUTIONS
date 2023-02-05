/*
Write a program to input 3 integer number a, b, c. Find the largest number among 3.
Also find the 2nd largest number among 3. Here is the sample output:
Enter the value of a, b, c:10 30 50
Largest number: 50
2nd largest number: 30 
*/

import java.util.*;
public class A3Q9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number A : ");
		int a=sc.nextInt();
		System.out.println("Enter number B : ");
		int b=sc.nextInt();
		System.out.println("Enter number C : ");
		int c=sc.nextInt();
		
		if(a>b && a>c) 
		{System.out.println("Greatest number is : "+a);
		if(b>c) {System.out.println("2 nd largest number is:"+b);}
		else if(c>b) { System.out.println("2 nd largest number is:"+c);}
		}
		else if(b>a && b>c)
		{System.out.println("Greatest number is : "+b);
		if(a>c) {System.out.println("2 nd largest number is:"+a);}
		else if(c>a) { System.out.println("Greatest number is : "+c);}
		}
		else if(c>a && c>b)
		{System.out.println("Greatest number is : "+c);
		if(a>b) {System.out.println("2 nd largest number is:"+a);}
		else if(b>a) {System.out.println("2 nd largest number is:"+b);}
		}
		
	}

}