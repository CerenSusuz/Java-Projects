package friendNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter numberOne: ");
		int numberOne = input.nextInt();
		int totalOne = 0;

        System.out.print("Enter numberTwo: ");
		int numberTwo = input.nextInt();
		int totalTwo = 0;
		
		for (int i = 1; i < numberOne; i++) {
			if (numberOne % i == 0) {
				totalOne = totalOne + i ;
			}
		}
		
		for (int i = 1; i < numberTwo; i++) {
			if (numberTwo % i == 0) {
				totalTwo = totalTwo + i ;
			}
		}
		
		if (numberOne == totalTwo && numberTwo == totalOne) {
			System.out.println(numberOne + " and " + numberTwo + " is friend numbers");
		}else {
			System.out.println(numberOne + " and " + numberTwo + " is NOT friend numbers");
		}
	}

}
