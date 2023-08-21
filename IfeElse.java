import java.util.Scanner;

public class IfeElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Diga um numero inteiro ");
		int Numero1 = input.nextInt();
		System.out.println("Diga o seguno numero ");
		int Numero2 = input.nextInt();

		if (Numero1 > Numero2) {
			System.out.println("O " + Numero1 + " é maior que o " + Numero2);

		} else {
			System.out.println("O " + Numero2 + " é maior que o " + Numero1);
		}

	}

}
