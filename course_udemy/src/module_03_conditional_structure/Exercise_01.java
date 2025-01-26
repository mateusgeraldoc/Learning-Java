package module_03_conditional_structure;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a interger number: ");
		int number = sc.nextInt();
		
		if (number >= 0) {
			System.out.println("Not Negative");
		}
		else {
			System.out.println("Negative");
		}
		
		sc.close();
	}

}
