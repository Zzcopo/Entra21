import java.util.Scanner;

public class IfeElse10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("fale um numero ");
		double numero = input.nextDouble();
		System.out.println("qual operaçao que voce quer fazer? 1 -  SOMA 10, 2 - SUBTRAI 10, 3 MULTIPLIQUE POR 10, 4 DIVIDA POR 10?");
		int operacao = input.nextInt();
		if (operacao == 1 ) {
			System.out.println(numero + 10);
		} else if (operacao == 2) {
			System.out.println(numero - 10);
		}else if (operacao == 3) {
			System.out.println(numero * 10);
		} else if (operacao == 4) {
			System.out.println(numero / 10);
		}
		
		
	}

}
