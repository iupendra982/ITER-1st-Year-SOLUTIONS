/*Make a simple game involving a computer and a user. The computer first guesses a
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.  */

import java.util.*;
public class A3Q4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int max=9;
	int min=1;
	int random=(int)((Math.random()*(max-min))+min);
	System.out.println("Enter a number between 1 and 9");
	int guess=sc.nextInt();
	
	if
	(random==guess) {System.out.println("You got it right");}
	else if
	(Math.abs(guess-random)==1){
		System.out.println("Almost got it");
		}
	else
	{
		System.out.println("You got it wrong");}
	}

}