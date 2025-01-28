package module_04_repeating_structure;

import java.util.Scanner;

public class While_structure {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a interger number: ");
		
		int number = sc.nextInt();
		int sum = 0;
		while (number!=0) {
			number = sc.nextInt();
			number = number+number;
			sum = sum + number;
		}
		System.out.println(sum);
		
	}

}
