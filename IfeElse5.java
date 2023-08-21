import java.util.Scanner;

public class IfeElse5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um caractere");
		char genero = input.next().charAt(0);
		genero = Character.toUpperCase(genero);
		if (genero == 'M') {
			System.out.println("Masculino");
		}

		if (genero == 'F') {
			System.out.println("Feminino");

		}

		if (genero == 'I') {
			System.out.println("Indefinido");

		}

	}

}
