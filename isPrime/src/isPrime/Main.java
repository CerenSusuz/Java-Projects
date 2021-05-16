package isPrime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
	
		boolean isPrime = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println(number + " is prime" );
		}
		else {
			System.out.println(number + " is NOT prime");
		}

	}

}
