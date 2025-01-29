package module_04_repeating_structure;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a Fuel: ");
		System.out.println("1. Alcohol");
		System.out.println("2. Gasoline");
		System.out.println("3. Diesel");
		System.out.println("4. Finish");
		
		int answer = sc.nextInt();
		int alcohol=0, gasoline=0, diesel=0;
		
		while(answer!=4) {
			switch(answer) {
			case 1:
				alcohol++;
				break;
			case 2:
				gasoline++;
				break;
			case 3: 
				diesel++;
				break;
			case 4: 
				break;
			default:
				System.out.println("Choose a valid number:");
				answer = sc.nextInt();
			}
		
			answer = sc.nextInt();
		}
		
		System.out.println("Thank You:");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gasoline: " + gasoline);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
