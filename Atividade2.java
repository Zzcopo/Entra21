import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual e o raio do circulo? ");
		double raio = input.nextDouble();
		double area = (raio * raio) / Math.PI;
		// System.out.println("A area do circulo e: " + area);
		System.out.printf("A area do circulo e: %.2f", area);

	}

}
