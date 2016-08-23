package challenges;

import java.util.Scanner;

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
