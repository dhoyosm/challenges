package challenges;

import java.util.Scanner;

public class ScannerMultiple {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String text = new String();
		do {
			System.out.println("Enter something: ");
			text = s.nextLine();
			if (!text.isEmpty()) {
				System.out.println("The text is: " + text);
			}
		} while (!text.isEmpty());
		s.close();
		System.out.println("Exit");
	}

}
