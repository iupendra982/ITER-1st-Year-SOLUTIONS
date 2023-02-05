/*
Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut
a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The
program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
whether the user or the computer wins, loses, or draws.
Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw 
*/
import java.util.*;
public class A3HAQ1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int computer=(int)(Math.random()*3);
        System.out.println("Scissor (0) , Rock (1) , Paper (2)");
        
        
        // switch(computer)
        // {
        //     case 0:{System.out.println("Scissor");}
        //     break;
        //     case 1:{System.out.println("Rock");}
        //     break;
        //     case 2:{System.out.println("Paper");}
        // }

        System.out.println("Enter your move");
        int user=sc.nextInt();
        System.out.println("You are : "+user);
        System.out.println("The Computer is : "+computer);

        // switch(user)
        // {
        //     case 0:{System.out.println("Scissor");}
        //     break;
        //     case 1:{System.out.println("Rock");}
        //     break;
        //     case 2:{System.out.println("Paper");}
        // }

        if(computer==user)
        {System.out.println("It is a draw");}
        else
        {
            boolean win= (user==0 && computer==2) || (user==1 && computer==0) || (user==2 && computer==1);
            if(win)
            System.out.println("You Won");
            else
            System.out.println("You Loose");
        }

    }
    
}
