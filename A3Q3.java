/* Write a program that reads three integers from the user and prints "Increasing" if the
numbers are in increasing order, "Decreasing" if the numbers are in decreasing order,
and "Neither increasing nor decreasing order" otherwise. 
*/

import java.util.*;
public class A3Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Integer one is:");
		int one=sc.nextInt();
		System.out.println("Integer two is:");
		int two=sc.nextInt();
		System.out.println("Integer three is:");
		int three=sc.nextInt();
		
		if(one>two && two>three)
		{System.out.println("Decreasing");}
	    else if(one<two && two<three)
	    {System.out.println("Increasing");}
		else
		{System.out.println("Neither Increasing nor decreasing");}
	
	}
	
}
