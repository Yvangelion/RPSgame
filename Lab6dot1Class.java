package Lab6dot1;

public class Lab6dot1Class {

	/* 
	 * Computer Science 1 Spring
	 * 6-1  Sum of a series.
	 *
	 *This program calculates the sum of a number series.
	 */

	public static void main(String[] args) {

		System.out.println("What is the sum of this series? 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + . . . + 95/97 + 97/99");

		double sum = 0.0;

		for (double n = 1.0; n <= 97.0; n = n + 2) {
			sum = sum + n / (n + 2);
		}
		System.out.println("The sum of the series is: " + sum);

	}
}
