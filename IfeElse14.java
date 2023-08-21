import java.util.Scanner;

public class IfeElse14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a nota da primeira prova?");
		double prova1 = input.nextDouble();
		System.out.println("Qual a nota da segunda prova?");
		double prova2 = input.nextDouble();
		System.out.println("Qual a nota da terceira prova?");
		double prova3 = input.nextDouble();
		System.out.println("Qual a nota dos exercicios?");
		double exercicios = input.nextDouble();
		double media = ((prova1 + (prova2 * 2) + (prova3 *3) + exercicios ) / 7);
		
		
		
		if (media >= 9) {
			System.out.println("sua media foi A, voce foi aprovado");
		} else if (media >= 7.5 && media <9 ) {
			System.out.println("sua media foi B, voce foi aprovado");
		} else if (media >= 6 && media < 7.5 ) {
			System.out.println("sua media foi C, voce foi aprovado");
		} else if (media >= 4 && media < 6) {
			System.out.println("sua media foi D, voce foi reprovado");
		} else if (media < 4) {
			System.out.println("sua media foi E, voce foi reprovado");
		} 
		
		
		
		
	}

}
