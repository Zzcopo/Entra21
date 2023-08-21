import java.util.Scanner;

public class IfeElse9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.err.println("BEM VINDO A SUA CALCULADORA PESSOAL DIGITE UM NUMERO");
		double Num1 = input.nextDouble();
		System.err.println("DIGITE OUTRO NUMERO");
		double Num2 = input.nextDouble();
		System.out.println("QUAL OPERAÇÃO VOCE QUER FAZER? 1 - SOMA, 2 - SUBTRAI, 3 - MULTIPLICA, 4 DIVIDE");
		
		int operacao = input.nextInt();
		
		if (operacao == 1) {
			System.out.print(Num1 + Num2 );
		} else if (operacao == 2 ) {
				System.out.println(Num1 - Num2);
			} else if (operacao == 3 ) {
				System.out.println(Num1 * Num2);
			} else if (operacao == 4) {
				System.out.println(Num1 / Num2);
			}
		
		}
}
		
		
		
			
		