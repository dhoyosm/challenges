package challenges;

import java.util.Scanner;

/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from to for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison scores by comparing with , with , and with .

    If , then Alice is awarded point.
    If , then Bob is awarded point.
    If , then neither person receives a point.

Given and , can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains space-separated integers, , , and , describing the respective values in triplet .
The second line contains space-separated integers, , , and , describing the respective values in triplet .

Constraints

Output Format

Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.
*/

public class CompareTheTriplets {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		int[] tripletA = new int[3];
		int[] tripletB = new int[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			tripletA[i] = scanner.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			tripletB[i] = scanner.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			if (tripletA[i] > tripletB[i]) {
				a++;
			} else if (tripletA[i] < tripletB[i]) {
				b++;
			}
		}
		scanner.close();
		System.out.println(a + " " + b);
	}

}
