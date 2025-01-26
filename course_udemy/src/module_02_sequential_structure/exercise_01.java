package module_02_sequential_structure;

import java.util.Scanner;

public class exercise_01 {

	public static void main(String[] args) {
		// Make a program to read two integer values, and then display the sum of these numbers on the screen
 
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int sum = number1 + number2;
		
		System.out.println("SOMA = " + sum);
		
		sc.close();
	}

}
