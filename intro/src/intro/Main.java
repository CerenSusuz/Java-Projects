package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello User");
		String button = "LogIn";
		double dollarYesterday = 4.44;
		double dollarToday = 4.44;
		int vat = 18;
		boolean isDown = true;
		
		//if-else if-else
		System.out.println("---If-Else Part---");
		if (dollarYesterday<dollarToday) {
			System.out.println("Dollar UP");
		}else if(dollarYesterday == dollarToday) {
			System.out.println("Nothing change");
		}else {
			System.out.println("Dollar DOWN");
		}
		
		//array
		System.out.println("---array Part---");
		String[] words = 
			{ 
				"hello",
				"java",
				"new syntax"
			};
		
		//for
		System.out.println("---for Part---");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		//foreach
		System.out.println("---foreach Part---");
		for (String word : words) {
			System.out.println(word);
		}
		
		//Primitive Data Type
		//int, double, float, byte, short, long, char, boolean
		int numberOne = 10;
		int numberTwo = 20;
		numberOne=numberTwo;
		numberTwo=30;
		System.out.println(numberOne); //20
		System.out.println(numberTwo); //30
		
		//Reference Data Type
		//class, interface, array, string
		int[] numbersOne= {1,2,3,4,5};
		int[] numbersTwo= {5,5,5,5,5};
		numbersOne=numbersTwo;
		numbersTwo[0]=200;
		System.out.println(numbersOne[0]); //200
		
		
		
	}

}
