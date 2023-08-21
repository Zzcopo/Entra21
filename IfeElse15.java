import java.util.Scanner;

public class IfeElse15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ola funcionario a quantos meses voce foi admitido?");
		double tempo = input.nextDouble();
		System.out.println("Qual é seu salario atual?");
		double salario = input.nextDouble();
		double porcentagem1 = ((salario * 5) / 100);
		double porcentagem2 = ((salario * 7) / 100);
		double aumento1 = (porcentagem1 + salario);
		double aumento2 = (porcentagem2 + salario);
		
		
		if (tempo < 12) {
			System.out.println("Seu salario sera de " + aumento1 + "voce recebeu 5% de aumento");
		} else if (tempo > 13 || tempo < 48) {

			System.out.printf("Seu salario sera de %.2f" , aumento2 , "voce recebeu 7% de aumento");

		}

	}
}