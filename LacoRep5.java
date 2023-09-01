import java.util.Scanner;

public class LacoRep5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double soma = 0;
		
		for ( double a = 0; a <= 4; a++) {
		System.out.println("digite a altura");
		double altura = input.nextDouble();
		soma = soma + altura;
		
		}
		System.out.println(soma /5);
	
	}
}