import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Oi por favor digite a quantia em dolar que voce ira trocar ");
		double Dolar = input.nextDouble();
		double Real = Dolar * 4.99;
		System.out.println("o valor que devera ser devolvido sera de R$" + Real);
		
		
		
	}

}
