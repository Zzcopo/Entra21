import java.util.Scanner;

/**
 * @author llorenco
 *
 */
public class LacoRep13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int maiorVal = Integer.MIN_VALUE;
		int menorVal = Integer.MAX_VALUE;

		while (true) {
			System.out.println("Escreva um valor");
			String valor = input.next();
			if (valor.equalsIgnoreCase("n")) {
				break;
			}

			int numero = Integer.parseInt(valor);
			menorVal = Math.min(menorVal, numero);
			maiorVal = Math.max(maiorVal, numero);

		}
		System.out.println("o menor valor é " + (menorVal == Integer.MAX_VALUE ? "poggers" : menorVal));
		System.out.println("o maior valor é " + (maiorVal == Integer.MIN_VALUE ? "kekw" : maiorVal));
	}
}