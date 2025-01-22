package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class exercise_06 {

	public static void main(String[] args) {
		/*
		Make a program that reads three double-precision floating point values: A, B and C. Then calculate and
		show:
		a) the area of the right triangle which has A for its base and C for its height.
		b) the area of the circle of radius C. (pi = 3.14159)
		c) the area of the trapezoid with A and B as bases and C as height.
		d) the area of the square with side B.
		e) the area of the rectangle with sides A and B.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		// triangle
		double triangle = (A*C)/2;
		
		// circle
		double pi = 3.14159;
		double circle = pi*(C*C);
		
		// trapezoid 
		double trapezoid = ((A+B)*C)/2;
		
		// square 
		double square = B*B;
		
		// rectangle 
		double rectangle = A*B;
		
		System.out.printf("TRIANGLE: %.3f\n", triangle);
		System.out.printf("CIRCLE: %.3f\n", circle);
		System.out.printf("TRAPEZOID: %.3f\n", trapezoid);
		System.out.printf("SQUARE: %.3f\n", square);
		System.out.printf("RECTANGLE: %.3f\n", rectangle);
	}

}
