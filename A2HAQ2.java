/*
If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is
essentially the definition of the / and % operators for integers.) Write a java program that asks
the user how many eggs she has and then tells the user how many dozen eggs she has and how
many extra eggs are left over. A gross of eggs is equal to 144 eggs. Extend your program so
that it will tell the user how many gross, how many dozen, and how many left over eggs she
has. 
For example, if the user says that she has 1342 eggs, and then your program would respond
with Your number of eggs is 9 gross, 3 dozen, and 10.
*/

import java.util.*;
public class A2HAQ2{
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Number off eggs you have : ");
      int eggs=sc.nextInt();
      int gross=eggs/144;
      System.out.println("Number of Gross of eggs you have : "+gross);
      int dozen=(eggs%144)/12;
      System.out.println("Number of Dozen off eggs you have : "+dozen);
      int left_eggs=((eggs%144)%12);
      System.out.println("Number of eggs left : "+left_eggs);




    }
}