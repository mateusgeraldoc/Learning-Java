package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class exercise_02 {

	public static void main(String[] args) {
		// Make a program to read the value of the radius of the circle, and then display the value of the circle area to four decimal places 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double radius = sc.nextDouble();
		
		double area = 3.14159 * (radius*radius);
		
		System.out.printf("A= %.4f", area);
		
		sc.close();
	}
}
