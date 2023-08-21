import java.util.Scanner;

public class IfeElse3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String Nome = input.next();
		if (Nome.equalsIgnoreCase("Lucas")) {
			System.out.println("Bem vindo " + Nome);
		} else {
			System.out.println("acho que voce quis dizer Lucas certo?");
		}

	}

}
