import java.util.Scanner;

public class ifeElse2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Diga um numero");
		int Numero1 = input.nextInt();
		System.out.println("Diga outro numero ");
		int Numero2 = input.nextInt();

		if (Numero1 % Numero2 == 0) {
			System.out.println("esses numero são multiplos");
		} else {
			System.out.println("Esses numeros nao são multiplos");
		}

	}

}
