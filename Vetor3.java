import java.util.Scanner;

public class Vetor3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int elementos[] = { 5, 20, 10, 3 };
		System.out.println("Diga um numero");

		int numero = input.nextInt();

		boolean search = false;
		int indicieFound = -1;

		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] == numero) {
				search = true;
				indicieFound = i;

			}
		}
		if (search) {
			System.out.println("este numero esta no indicie " + indicieFound);
		} else {
			System.out.println("numero nao encontrado");
		}
	}
}