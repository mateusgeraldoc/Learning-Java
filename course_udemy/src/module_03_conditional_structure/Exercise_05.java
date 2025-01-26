package module_03_conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Code    Item    Price");
		System.out.println(" 1     HotDog   $4.00");
		System.out.println(" 2     Breads   $4.50");
		System.out.println(" 3     Burger   $5.00");
		System.out.println(" 4     Toasts   $2.00");
		System.out.println(" 5     Juice    $1.50\n");
		
		double priceItem1 = 4.0;
		double priceItem2 = 4.5;
		double priceItem3 = 5.0;
		double priceItem4 = 2.0;
		double priceItem5 = 1.5;
		
		System.out.println("Choose the item Code: ");
		int codeItem = sc.nextInt();
		System.out.println("Choose the quantity: ");
		int quantity = sc.nextInt();
		double totalPrice = 0;
		
		if (codeItem == 1) {
			totalPrice = quantity*priceItem1;
		}
		else if (codeItem == 2) {
				totalPrice = quantity*priceItem2;
		}
		else if (codeItem == 3) {
				totalPrice = quantity*priceItem3;
		}
		else if (codeItem == 4) {
				totalPrice = quantity*priceItem4;
		}
		else if (codeItem == 5) {
				totalPrice = quantity*priceItem5;
		}
		else {
			System.out.println("Item Code Inválid");
		}
		
		System.out.printf("Total: $%.2f", totalPrice);
		sc.close();
	}

}
