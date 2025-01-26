package module_02_sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class exercise_03 {

	public static void main(String[] args) {
		/* Make a program to read four integer values A, B, C and D. Then calculate and display the difference of the product
		of A and B by the product of C and D */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int difference = (A*B-C*D);
		
		System.out.println("Difference = " + difference);
		
		sc.close();
	}
}