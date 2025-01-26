package module_03_conditional_structure;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a interger number: ");
		int number = sc.nextInt();
		
		if (number%2==0) {
			System.out.println("The number is EVEN");
		}
		else {
			System.out.println("The number is ODD");
		}
		
		sc.close();
	}

}
