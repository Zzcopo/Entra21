import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual é o valor 1?");
		int Valor1 = input.nextInt();
		System.out.println("Qual é o valor 2?");
		int Valor2 = input.nextInt();
		int Soma = Valor1 + Valor2;
		int Multiplicacao = Valor1 * Valor2;
		System.out.println("A soma entre o " + Valor1 + " e o " + Valor2 + " é: " + Soma);
		System.out.println("A multiplicacao entre " + Valor1 + " e " + Valor2 + " é: " + Multiplicacao);

	}

}
