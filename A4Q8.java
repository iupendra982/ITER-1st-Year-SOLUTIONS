/*
Write a program that generates a random integer number between 1 to 10 and asks the user to
guess what the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again." If the user's guess is lower than the random number, the
program should display "Too low, try again." The program should use a loop that repeats until
the user correctly guesses the random number and display good guess.
Sample run:
Computer guess: 7
User guess: 5
Too low, try again
Computer guess: 5
User guess: 7
Too high, try again
Computer guess: 5
User guess: 5
Good guess
*/

import java.util.*;
public class A4Q8 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int k=0;
	while(true)
	{
	k++;
	System.out.println("Guess a number between 1 to 10");
	int user_guess=sc.nextInt();
	int computer_guess= (int)((Math.random()*10)+1);
	System.out.println("Your Guess "+user_guess);
	System.out.println("Computer Guess "+computer_guess);
	if(computer_guess==user_guess)
	{
		System.out.println("Good Guess");
		break;
	}
	else if(user_guess>computer_guess)
	{
		System.out.println("Too high, try again.");
	}
	else
	{
		System.out.println("Too low, try again");
	}
    }	
	System.out.println("Woww!! You have taken only "+k+" chances to guess correctly");
	}
}