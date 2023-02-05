/*Write a program to input the age of a person and check if the age of the person is
greater than or equal to 18 then print the message:
“You are eligible to cast your vote”.
 */

 import java.util.*;
public class A3Q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible to caste your vote");
		}
		
		


	}

}
