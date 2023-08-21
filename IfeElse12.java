import java.util.Scanner;

public class IfeElse12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a idade do Zezinho?");
		int Idade1 = input.nextInt();
		System.out.println("Qual a idade do Marquinhos?");
		int Idade2 = input.nextInt();
		System.out.println("Qual a idade da Luluzinha?");
		int Idade3 = input.nextInt();

		if (Idade1 > Idade2 && Idade2 > Idade3) {
			System.out
					.println("Zezinho é o mais velho, Marquinhos é o filho do meio e a Luluzinha é a filha mais nova");
		} else if (Idade2 > Idade1 && Idade1 > Idade3) {
			System.out
					.println("Marquinhos é o mais velho, Zezinho é o filho do meio e a Luluzinha é a filha mais nova");
		} else if (Idade2 > Idade3 && Idade3 > Idade1) {
			System.out.println(
					"Marquinhos é o mais velho, Luluzinha é a filha do meio e o Marquinhos é o filho mais novo");
		} else if (Idade3 > Idade1 && Idade1 > Idade2) {
			System.out
					.println("luluzinha é a mais velha, Zezinho é o filho do meio e o Marquinhos é o filho mais novo");
		} else if (Idade3 > Idade2 && Idade2 > Idade1) {
			System.out
					.println("Luluzinha é a mais velha, Marquinhos é o filho do meio e o Zezinho é o filho mais novo");
		}

	}
}