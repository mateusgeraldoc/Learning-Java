package module_03_conditional_structure;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a interger number: ");
		int number = sc.nextInt();
		System.out.println("Insert other interger number: ");
		int number2 = sc.nextInt();
		
		if (number > number2) {
			int multiple = number/number2;
			if (multiple*number2==number){
				System.out.println(number + " and " + number2 + " are Multiple");
			}
			else {
				System.out.println(number + " and " + number2 + " are not Multiple");
			}
		}
		else {
			int multiple = number2/number;
			if (multiple*number==number2){
				System.out.println(number + " and " + number2 + " are Multiple");
			}
			else {
				System.out.println(number + " and " + number2 + " are not Multiple");
			}
		}
		
		sc.close();
		
		/*
		Correction:
		
		if (number % number2 == 0 || number2 % number == 0) {
			System.out.println(number + " and " + number2 + " are Multiple");
		}
		else {
			System.out.println(number + " and " + number2 + " are not Multiple");
		}
		
		sc.close();
		*/
	}

}
