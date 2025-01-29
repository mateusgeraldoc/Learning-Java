package module_04_repeating_structure;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Password: ");
		int password = sc.nextInt();
		
		//correct password: 2002
		while (password != 2002) {
			System.out.println("Incorrect Password. Try Again: ");
			password = sc.nextInt();
		}
		
		System.out.println("Correct Password. Acess Allowed");
		
		sc.close();
	}

}
