package Lab6dot2;

import java.util.Scanner;

public class Lab6dot2Class {

	/* 
	 * Computer Science 1 Spring
	 * 6-2  Rock paper scissors.
	 *
	 *This program allows a user to play rock paper scissors with the computer. The program generates a random number from 0 to 2
	 *then compares the value to the user input in order to determine if the user won or lost the game.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userCount = 0 ;
        int computerCount = 0;
        
        while(true){
    		int computer = (int)(Math.random() * 3);
    		System.out.print("Enter your selection:  scissor (0), rock (1), paper (2): ");
    		  
    		int user = input.nextInt();

    		System.out.print("The computer is ");
    		switch (computer)
    		{
    		case 0: System.out.print("scissor"); break;
    		case 1: System.out.print("rock"); break;
    		case 2: System.out.print("paper");break;
    		}
    
    		System.out.print(". You are ");
    		switch (user)
    		{
    		case 0: System.out.print("scissor"); break;
    		case 1: System.out.print("rock"); break;
    		case 2: System.out.print("paper");break;
    		}
    
    		if (computer == user)
    			System.out.println(" too. It is a draw");
    		else
    		{
    			boolean userwin = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
    			if (userwin){
    				System.out.println(". You won");
    				userCount++;
    			}
    			else{
    				System.out.println(". You lost");
    				computerCount++;
    			}
    		}
    		if(userCount - computerCount > 2 || computerCount - userCount > 2){
    			System.out.println("Game Over");
    		    break;
    		}
        }
		input.close(); 

	}



}


