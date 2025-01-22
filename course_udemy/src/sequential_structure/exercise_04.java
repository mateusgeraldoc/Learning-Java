package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class exercise_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double salaryByHour = sc.nextDouble(); 
		double salary = salaryByHour * hours;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
	}

}
