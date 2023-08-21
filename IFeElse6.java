import java.util.Scanner;

public class IFeElse6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos anos você tem?");
		int Idade = input.nextInt();

		if (Idade >= 5 && Idade <= 7) {
			System.out.println("Pré-Mirim");
		} else if (Idade >= 8 && Idade <= 10) {
			System.out.println("Mirim");

		} else if (Idade >= 11 && Idade <= 13) {
			
			System.out.println("Infantil");
		} else if (Idade >= 14 && Idade <= 17) {
			System.out.println("Infanto-Juvenil");
			
		} else if (Idade >= 18 && Idade <= 20) {
			System.out.println("Juvenil");
			
		} else if
			(Idade > 20) {
			System.out.println("adulto maiores");
		}
	}

}
