import java.util.Scanner;

public class IfeElse8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quais é sua primeira carta?");
		int carta1 = input.nextInt();
		if (carta1 > 13 || carta1 < 1) {
			System.err.println("Carta invalida");
		} else
			System.out.println("Qual a sua segunda carta?");
		int carta2 = input.nextInt();
		if (carta2 < 1 || carta2 > 13) {
			System.err.println("Carta invalida");
		} else
			System.out.println("Qual  a terceira carta?");
		int carta3 = input.nextInt();
		if (carta3 < 1 || carta3 > 13) {
			System.err.println("Carta invalida");
		} else if (carta1 == 1 && carta2 == 1 && carta3 == 1 || carta1 == 2 && carta2 == 1 && carta3 == 1
				|| carta1 == 3 && carta2 == 1 && carta3 == 1 || carta1 == 1 && carta2 == 2 && carta3 == 1
				|| carta1 == 1 && carta2 == 3 && carta3 == 1 || carta1 == 1 && carta2 == 1 && carta3 == 2
				|| carta1 == 1 && carta2 == 1 && carta3 == 3 || carta1 == 2 && carta2 == 2 && carta1 == 1
				|| carta1 == 2 && carta2 == 3 && carta3 == 1 || carta1 == 2 && carta2 == 2 && carta3 == 2
				|| carta1 == 2 && carta2 == 2 && carta3 == 3 || carta1 == 3 && carta2 == 2 && carta3 == 1
				|| carta1 == 3 && carta2 == 2 && carta3 == 2 || carta1 == 3 && carta2 == 2 && carta3 == 3
				|| carta1 == 3 && carta2 == 3 && carta3 == 1 || carta1 == 1 && carta2 == 2 && carta3 == 2
				|| carta1 == 3 && carta2 == 3 && carta3 == 3 || carta1 == 1 && carta2 == 3 && carta3 == 3
				|| carta1 == 1 && carta2 == 3 && carta3 == 2 || carta1 == 1 && carta2 == 2 && carta3 == 3
				|| carta1 == 2 && carta2 == 1 && carta3 == 2 || carta1 == 2 && carta2 == 1 && carta3 == 3
				|| carta1 == 2 && carta2 == 3 && carta3 == 2 || carta1 == 2 && carta2 == 3 && carta3 == 3
				|| carta1 == 3 && carta2 == 1 && carta3 == 2 || carta1 == 3 && carta2 == 1 && carta3 == 3
				|| carta1 == 3 && carta2 == 3 && carta3 == 2)
			System.err.println("NOVE");
		else if (carta1 == 1 && carta2 == 1 || carta1 == 2 && carta2 == 3 || carta1 == 2 && carta3 == 1
				|| carta1 == 2 && carta3 == 2 || carta1 == 2 && carta3 == 3 || carta1 == 1 && carta2 == 2
				|| carta1 == 3 && carta2 == 1 || carta1 == 3 && carta3 == 1 || carta1 == 1 && carta2 == 3
				|| carta1 == 3 && carta2 == 2 || carta1 == 1 && carta3 == 2 || carta1 == 2 && carta2 == 1
				|| carta1 == 3 && carta2 == 3 || carta1 == 1 && carta3 == 3 || carta1 == 2 && carta2 == 2
				|| carta1 == 1 && carta3 == 1 || carta2 == 1 && carta3 == 1 || carta1 == 3 && carta3 == 2
				|| carta1 == 3 && carta3 == 3 || carta2 == 1 && carta3 == 2 || carta2 == 1 && carta3 == 3
				|| carta2 == 2 && carta3 == 1 || carta2 == 2 && carta3 == 2 || carta2 == 2 && carta3 == 3
				|| carta2 == 3 && carta3 == 1 || carta2 == 3 && carta3 == 2 || carta2 == 3 && carta3 == 3)
			System.err.println("SEIS");
		else if (carta1 == 1 || carta2 == 1 || carta3 == 1 || carta1 == 2 | carta2 == 2 || carta3 == 2 || carta1 ==3 || carta2 == 2 || carta3 ==3 ) {
			System.err.println("TRUCO");
		}
	}
}