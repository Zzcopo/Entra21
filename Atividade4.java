import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual o valor A? ");
		Double A = input.nextDouble();
		System.out.println("Qual é o valor B? ");
		Double B = input.nextDouble();
		System.out.println("Qual é o valor C? ");
		Double C = input.nextDouble();
		System.out.println("Qual é o valor D? ");
		Double D = input.nextDouble();
		Double Produto1 = A * B;
		Double Produto2 = C * D;
		Double Diferenca = Produto1 - Produto2;

		System.out.println("o produto entre A e B é " + Produto1);
		System.out.println("o produto entre C e D é " + Produto2);
		System.out.println("a diferenca entra os produtor é " + Diferenca);

	}

}
