package Lab6dot3;

import java.util.Scanner;
import java.util.Random;

public class Lab6dot3Class {

	/*
	 * Yvan Ngah Computer Science 1 Spring 6-3 MathTutor
	 *
	 * This program calculates an equation and then prompts the user to answer the
	 * equation. The computer then checks if the users answer is correct.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int choice, numProblems, maxOperand, num1, num2, answer = 0,user_answer;
		float float_answer;

		do {
			System.out.println("Math Tutor");

			System.out.println(
					"Choose the type of problem:\n" +
							"1. Addition\n" +
							"2. Subtraction\n" +
							"3. Multiplication\n" +
							"4. Division\n"+
							"5. Quit"
					);

			System.out.print("Enter your choice: \n");
			choice = sc.nextInt();

			if( choice != 5){
				System.out.print("How many problems? \n");
				numProblems = sc.nextInt();
				maxOperand = 10;

				for (int i = 0; i < numProblems; i++) {
					num1 = rnd.nextInt(maxOperand);
					num2 = rnd.nextInt(maxOperand);

					if (choice == 1) {
						System.out.printf("%d + %d = ?\n", num1, num2);
						user_answer=sc.nextInt();
						answer = num1 + num2;
						if( user_answer == answer ) {
							System.out.println("Correct!");
						} else {
							System.out.printf("Incorrect. The answer is %d.\n", answer);
						}
					}
					else if (choice == 2) {
						while(num2>num1){
							num1 = rnd.nextInt(maxOperand);
							num2 = rnd.nextInt(maxOperand);
						}
						System.out.printf("%d - %d = ?\n", num1, num2);
						user_answer=sc.nextInt();
						answer = num1 - num2;
						if( user_answer == answer ) {
							System.out.println("Correct!");
						} else {
							System.out.printf("Incorrect. The answer is %d.\n", answer);
						}
					}
					else if (choice == 3) {
						System.out.printf("%d * %d = ?\n", num1, num2);
						user_answer=sc.nextInt();
						answer = num1 * num2;
						if( user_answer == answer ) {
							System.out.println("Correct!");
						} else {
							System.out.printf("Incorrect. The answer is %d.\n", answer);
						}
					}
					else if (choice == 4) {
						while(num2 == 0){
							num2 = rnd.nextInt(maxOperand);
						}
						System.out.printf("%d / %d = ?\n", num1, num2);
						float user_float_answer=sc.nextFloat();
						float_answer = num1 / num2;
						if( user_float_answer == float_answer ) {
							System.out.println("Correct!");
						} else {
							System.out.printf("Incorrect. The answer is %f.\n", float_answer);
						}
					}

				}

				System.out.println("\n");

			}

		}while (choice != 5);
		sc.close();
	} 
} 


