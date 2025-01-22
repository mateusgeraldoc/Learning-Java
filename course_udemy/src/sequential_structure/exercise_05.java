package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class exercise_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codeItem1 = sc.nextInt();
		int quantityItem1 = sc.nextInt();
		double unitPriceItem1 = sc.nextDouble();
		double totalPriceItem1 = quantityItem1 * unitPriceItem1;
		
		int codeItem2 = sc.nextInt();
		int quantityItem2 = sc.nextInt();
		double unitPriceItem2 = sc.nextDouble();
		double totalPriceItem2 = quantityItem2 * unitPriceItem2;
		
		double total = totalPriceItem1 + totalPriceItem2;
		
		System.out.printf("TOTAL PRICE: $%.2f", total);
		
	}

}
