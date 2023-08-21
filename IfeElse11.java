import java.util.Scanner;

public class IfeElse11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a idade do primeiro homem? ");
		int H1 = input.nextInt();
		System.out.println("Qual a idade do segundo homem?");
		int H2 = input.nextInt();
		System.out.println("Qual a idade da primeira mulher?");
		int M1 = input.nextInt();
		System.out.println("Qual a idade da segunda mulher?");
		int M2 = input.nextInt();
		
		if (H1 > H2 && M1 > M2) {
			System.out.println(H1 + M2);
		} else if (H1 > H2 && M1 < M2 ) {
			System.out.println(H1 + M2);
		} else if (H1 < H2 && M1 > M2) {
			System.out.println(H2 + M1);
		} else System.out.println(H2 + M2);
		
		
		
	}

}
