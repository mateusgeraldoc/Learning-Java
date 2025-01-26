package module_03_conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a number: ");
		double number = sc.nextDouble();
		
		if (number>=0 && number<=25) {
			System.out.println("Position [0,25]");
		}
		else if (number>25 && number<=50) {
				System.out.println("Position [25,50]");
		}
		else if (number>50 && number<=75) {
				System.out.println("Position [50,75]");
		}
		else if (number>75 && number<=100) {
				System.out.println("Position [75,100]");
		}
		else {
				System.out.println("Inválid Position");
		}
		sc.close();
	}

}
