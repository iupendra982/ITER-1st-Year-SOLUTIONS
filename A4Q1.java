/*
Write a java program that gets three integer numbers from the user. Count from the first number
to the second number increments by the third number. Use for loop to do it. Also, display the
sum of numbers displayed between the first number and second number.
Sample run:
Enter first number: 4
Enter second number: 13
Enter third number: 3
4 7 10 13
The sum of number displayed is 34
 */


 import java.util.*;
 public class A4Q1 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter First Number ");
         int FN=sc.nextInt();
         System.out.println("Enter Second Number ");
         int SN=sc.nextInt();
         System.out.println("Enter Third Number ");
         int TN=sc.nextInt();
         int sum=0;
         
         for(int i=FN;i<=SN;i=i+TN)
         {
             System.out.println(i);
             sum=sum+i;
         }
         System.out.println("The sum of the number displayed is :"+sum);
 
 
     }
 
 }