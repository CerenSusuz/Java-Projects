package perfectNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
		System.out.print("Enter number: ");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i ;
			}
		} 
		
		if (total == number) {
			System.out.println(number + " is perfect number");
		}else {
			System.out.println(number + " is NOT perfect number");
		}
	}

}
