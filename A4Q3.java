/*
Write a java program that takes an integer N from user, uses
Math. Random () to print N random integer numbers between 1 to N, and then prints their
average value. Use do while loop.
Sample run:
Enter a number: 6
Random numbers generated are: 6 4 5 2 2 5
Average of 6 random numbers are 4
 */

import java.util.*;
public class A4Q3 {
    public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number : ");
    int n=sc.nextInt();
    int sum=0;
    int i=1;
    do{
    int random=(int)((Math.random()*n)+1);
    System.out.println("Random values generated are "+random+" ");
    i++;
    sum+=random;
    }while(i<=n);
    int average=sum/n;
    System.out.println("Average of "+n+" random numbers are "+average);


    }
}
