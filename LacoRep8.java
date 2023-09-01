import java.util.Scanner;

public class LacoRep8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double nota = 1;
		double nota2 = 1;
		
	while (true) {	
		System.out.println("qual seu nome?(digite fim para finalizar)");
		String nome = input.nextLine();
		
		if (!(nome != "fim")) {
			break;
		} else 	System.out.println("Digite a primeira nota ");
	nota = input.nextDouble();
	System.out.println("digite a segunda nota");
	nota2 = input.nextDouble();
	
	double media = (nota+nota2)/2;
	System.out.println("A media do aluno " + nome + " é " + media);
	input.nextLine();
	}

	}


}
