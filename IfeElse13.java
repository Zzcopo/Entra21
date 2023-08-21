import java.util.Scanner;

public class IfeElse13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a sua altura ?");
		double Altura = input.nextDouble();
		System.out.println("Quanto voce pesa?");
		double Massa = input.nextDouble();
		double IMC = Massa / (Altura * Altura); 
		
		if (IMC < 18.5) {
			System.out.println("Magreza");
		} else if (IMC >= 18.5 && IMC <= 24.9 ) {
			System.out.println("Sobrepeso");
		}else if (IMC >= 25 && IMC <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (IMC >= 30 && IMC <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if (IMC >= 35 && IMC <= 39.9) {
			System.out.println("Obesidade grau II (severa)");
		} else if (IMC > 40 ) {
			System.out.println("Obesidade grau III (morbida)");
		} 
		
		
		
	}

}
