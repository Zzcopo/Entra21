import java.util.Scanner;

public class LAcorep6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double soma = 0;
		int contador = 0;
		double altura = 1;

		while (altura != 0) {
			System.out.println("digite a altura");
			altura = input.nextDouble();

			if (altura != 0) {
				soma += altura;
				contador++;

			}

		}
		if (contador != 0) {
			double media = soma / contador;
			System.out.println("a media de altura é " + media);
		} else {
			System.out.println("nenhum dado foi inserido");
		}
	}
}