/*
A University conducts a 100-mark exam for its student and grades them as follows.
Assigns a grade based on the value of the marks. Write a java program to print the
grade according to the mark secured by the student. [Use switch-case].
Mark Range Letter Grade
(>=90) O
(>=80 AND <90) A
(>=70 AND <80) B
(>=60 AND <70) C
(>=50 AND <60) D
(>=50 AND <40) E
(<40) F
 */

 import java.util.*;
public class A3Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		int n=marks/10;
		
		switch(n) {
		case 10 :
		{System.out.println("Your Grade is : O");}
		break;
		case 9 :
		{System.out.println("Your Grade is : O");}
		break;
		case 8 :
		{System.out.println("Your Grade is : A");}
		break;
		case 7 :
		{System.out.println("Your Grade is : B");}
		break;
		case 6 :
		{System.out.println("Your Grade is : C");}
		break;
		case 5 :
		{System.out.println("Your Grade is : D");}
		break;
		case 4 :
		{System.out.println("Your Grade is : E");}
		break;
		default :
		{System.out.println("Your Grade is : F");}
		break;
		
		
		
		
		
		
		}

	}

}