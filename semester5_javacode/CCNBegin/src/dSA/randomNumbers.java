package dSA;

import java.util.Random;

public class randomNumbers {
	// Generate random numbers (from 1-100)
	// Print number of occurrences of each number

	public static final int DIFF_NUMBERS = 100;
	public static final int TOTAL_NUMBERS = 1000000;

	public static void main(String[] args) {
		// create array , initialize to 0
		int[] numbers = new int[DIFF_NUMBERS + 1];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		Random r = new Random();
		// generate numbers
		for (int i = 0; i < TOTAL_NUMBERS; i++)
			numbers[r.nextInt(DIFF_NUMBERS) + 1]++;
		for (int i = 1; i <= DIFF_NUMBERS; i++)
			System.out.println(i + ": " + numbers[i]);
	}

}
