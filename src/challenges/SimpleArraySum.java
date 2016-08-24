package challenges;

import java.util.Scanner;

/*
 * Given an array of integers, can you find the sum of its elements?
 * 
 * Input Format
 * 
 * The first line contains an integer, , denoting the size of the array. The
 * second line contains space-separated integers representing the array's
 * elements.
 * 
 * Output Format
 * 
 * Print the sum of the array's elements as a single integer.
 * 
 * Sample Input
 * 
 * 6 1 2 3 4 10 11
 * 
 * Sample Output
 * 
 * 31
 */

public class SimpleArraySum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			sum += scanner.nextInt();
		}
		scanner.close();
		System.out.println(sum);
	}

}
