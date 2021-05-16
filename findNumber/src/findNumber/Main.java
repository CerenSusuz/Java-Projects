package findNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};
		
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter number: ");
		int number = input.nextInt();
		
		boolean isHere = false;
		
		for (int inNumber : numbers) {
			if (inNumber == number) {
				isHere = true;
				break;
			}
		}
		
		if (isHere) {
			System.out.println("is here");
		}else {
			System.out.println("is NOT here");
		}
	}

}
