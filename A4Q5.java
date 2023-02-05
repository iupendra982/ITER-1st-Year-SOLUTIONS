/*
Write a Java program to check if a number is perfect number or not.
(Hints: A number N is called perfect number, if the sum of factors except N as a factor is
equals to the number N.
Example:
N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)
Sample run1:
Enter a number: 496
496 is a perfect number.
Sample run2:
Enter a number: 490
490 is not a perfect number. 
*/


import java.util.*;
public class A4Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum of factors = "+sum);
        if(sum==n)
            System.out.println("It is a prfect number");
        else
            System.out.println("It is not a perfect number");
        }
}