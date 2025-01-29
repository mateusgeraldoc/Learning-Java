package module_04_repeating_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("X and Y: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x!=0.0 && y!=0.0) {
			if (x > 0.0 && y > 0.0) {
				System.out.println("first");
			} else if (x < 0.0 && y > 0.0) {
					System.out.println("second");
			} else if (x < 0.0 && y < 0.0) {
					System.out.println("third");
			} else {
					System.out.println("fourth");
			}	
			
			System.out.println("\nX and Y: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();

	}

}
