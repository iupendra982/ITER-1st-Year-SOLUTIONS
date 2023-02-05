/*
Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of
a triangle and displays its area. The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area=√𝑠 ∗ (𝑠 − 𝑎) ∗ (𝑠 − 𝑏) ∗ (𝑠 − 𝑐)
Here is a sample run:
Enter three points for a triangle: (1.5  -3.4)  (4.6  5)  (9.5 -3.4)
The area of the triangle is 33.6
 */

 import java.util.*;
public class A2HAQ3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three points for a Triangle : ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        double a=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        double b=Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
        double c=Math.pow(Math.pow(x3-x1,2)+Math.pow(y3-y1,2),0.5);
        double s=(a+b+c)/2.0;
        double area=Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        System.out.println("Area is : "+area);




    }
}
