package module_03_conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		
		/*  	  y
		 *       |
		 *  S2   |   S1
		 *  _____|______ x
		 *       |
		 *  S3   |   S4
		 *  	 |
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the position of the X: ");
		double x = sc.nextDouble();
		System.out.println("Insert the position of the Y: ");
		double y = sc.nextDouble();
		
		if (x==0.0 && y==0.0) {
			System.out.println("Origin Point");
		}
		else if (x==0.0 && y!=0.0) {
				System.out.println("Axle Y");
		}
		else if (x!=0.0 && y==0.0) {
				System.out.println("Axle X");
		}
		else if (x>0.0 && y>0.0) {
				System.out.println("S1");
		}
		else if (x<0.0 && y>0.0) {
				System.out.println("S2");
		}
		else if (x<0.0 && y<0.0) {
				System.out.println("S3");
		}
		else {
				System.out.println("S4");
		}
	
		sc.close();
	}

}
