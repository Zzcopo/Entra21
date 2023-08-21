import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
 
		System.out.println("Insira o valor da largura: ");
		int largura = input.nextInt();
		System.out.println("Insira o valor da altura: ");
		int altura = input.nextInt();
		int perimetro = (largura * 2 + altura * 2 );
		int area = (largura * altura);
		
		
		
		System.out.println("O perimetro do retangulo é : " + perimetro);
		System.out.println("A area do retangulo é :" + area);
	}

}