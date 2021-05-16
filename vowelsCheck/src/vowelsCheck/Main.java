package vowelsCheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Enter letter: ");
		
		Scanner input = new Scanner(System.in);
		
		String letter = input.next();
		System.out.println(letter);
		
		switch (letter) {
		case "A":
		case "I":
		case "O":
		case "U":
			System.out.println(letter + " is vowel");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + letter);
		}

	}

}
