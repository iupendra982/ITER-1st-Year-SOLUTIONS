/*
Write a java program that prompts the user to enter an integer for today’s day of the
week (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter
the number of days after today for a future day and display the future day of the week.
Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
Enter today's day: 0 Enter the number of days elapsed
since today: 31
Today is Sunday and the future day is Wednesday 
*/

import java.util.*;
public class A3HAQ2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter today's day");
        int day=sc.nextInt();
        System.out.println("Enter the number of days elapsed :");
        int days_elapsed=sc.nextInt();
        int future_day=(days_elapsed+day)%7;
        System.out.print("Today is : ");

        switch(day)
        {
            case 0:{System.out.println("Sunday");}
            break;
            case 1:{System.out.println("Monday");}
            break;
            case 2:{System.out.println("Tuesday");}
            break;
            case 3:{System.out.println("Wednesday");}
            break;
            case 4:{System.out.println("Thursday");}
            break;
            case 5:{System.out.println("Friday");}
            break;
            case 6:{System.out.println("Saturday");}
            break;
        }

        System.out.print("The future day is : ");

        switch(future_day)
        {
            case 0:{System.out.println("Sunday");}
            break;
            case 1:{System.out.println("Monday");}
            break;
            case 2:{System.out.println("Tuesday");}
            break;
            case 3:{System.out.println("Wednesday");}
            break;
            case 4:{System.out.println("Thursday");}
            break;
            case 5:{System.out.println("Friday");}
            break;
            case 6:{System.out.println("Saturday");}
            break;
        }



    }
}