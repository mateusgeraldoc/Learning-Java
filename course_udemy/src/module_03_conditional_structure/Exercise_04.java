package module_03_conditional_structure;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the start time of the match: ");
		int startTime = sc.nextInt();
		System.out.println("Insert the end time of the match: ");
		int endTime = sc.nextInt();
		
		int timePeriod;
		if (startTime < endTime) {
			timePeriod = endTime - startTime; 
		}
		else {
			timePeriod = (24-startTime)+endTime;
		}
		System.out.println("The match lasted " + timePeriod + " hour(s)");
	}

}
