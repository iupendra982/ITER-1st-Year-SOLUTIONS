/*
Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays
the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
Here is a sample run:
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days. 
*/



import java.util.*;
public class A2HAQ1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of minutes : ");
        int min=sc.nextInt();
        int year=min/(60*24*365);
        int days=(min%(60*24*365))/(24*60);

        System.out.println(min+"minutes is approximately "+year+" years "+days+" days.");



    }
}
