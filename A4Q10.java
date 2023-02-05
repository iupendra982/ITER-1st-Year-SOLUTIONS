/*
Write a java program to print largest power of three less than or equal to N.
Sample run:
Enter a number: 100
The largest power of 3 less than or equal to 100 is 81
*/


import java.util.*;
public class A4Q10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int power=1;
        while((power*3)<=n){
            power=power*3;
        }
        System.out.println("The largest power of 3 less than or equal to "+n+" is "+power);
    }
    
}
