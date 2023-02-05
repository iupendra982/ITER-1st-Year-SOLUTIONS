/*Write a Java program that takes a year from user and print true if that year is a leap year
otherwise print false.  */

import java.util.*;
public class A3Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the year");
		int year=sc.nextInt();
		if(year%4==0)
		{
		  if(year%100==0)
		  { 
		    if(year%400==0)
		    {
		    	System.out.println("It is a leap year");
            }
		    else 
		    {
		    	System.out.println("It is not a leap year");
            }
         }
		  else
		  {
			  System.out.println("It is a leap year");
          }
		}

    }
}
