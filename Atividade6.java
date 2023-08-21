import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Por favor diga seu nome: ");
		String nome = input.next();

		System.out.println("Seja bem vindo " + nome);

		System.out.println("Qual e seu salario fixo? ");
		double Salario = input.nextDouble();

		System.out.println("Quantos reais voce vendeu esse mes? ");
		double Reais = input.nextDouble();
		double Porcentagem = (Reais * 15) / 100;
		System.out.println("Sua comicao e de " + Porcentagem);
		double Total = Salario + Porcentagem;
		System.out.printf("E seu salario total sera de = %.2f", Total);

	}
}
