import java.util.Scanner;

public class IfeElse7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("De um valor para x");
		double X = input.nextDouble();
		System.out.println("De um valor para Y");
		double Y = input.nextDouble();

		if (X < 0 || Y < 0) {

			System.out.println("O valor esta no Terceiro Quadrante");
		} else if (X > 0 || Y < 0) {
			System.out.println("O valor esta no Quarto Quadrante ");

		} else if (X > 0 || Y > 0) {
			System.out.println("O valor esta no Segundo Quadrante");

		} else if (X < 0 || Y > 0) {
			System.out.println("O valor esta no Primeiro Quadrante");
		}

	}

}
