import java.util.Iterator;
import java.util.Scanner;

public class LacoRep11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Diga o numero que voce quer fazer fatorial");
		double num = input.nextDouble();
		int fat = 1;

		if (num >= 0) {
			for (int i = 1; i <= num; i++) {
				fat = fat * i;
			}
			System.out.println("O fatorial do numero  " + num + " é " + fat);
		} else {
			System.out.println("Diga apenas numero positivos");
		}
	}
}
