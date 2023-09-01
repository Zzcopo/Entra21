import java.util.Scanner;

public class LacoRep9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma = 0; 
		int contador = 0;
		int contadorf = 0;
		double somaf = 0;
	
		while ((true)) { 
			System.out.println("Qual é sua altura");
			double altura = input.nextDouble();
		if (altura == 0) {
			break;
		}
		System.out.println("Qual é seu genero ? (f para feminino e m para masculino");
			char genero = input.next().charAt(0);
		if (genero == 'f') {
			somaf += altura;
			soma += altura;
			contador++;
			contadorf++;
		
		} if (genero == 'm') {
			soma += altura;
			contador++;
		
		}
	

}
		double mediaG = soma / contador;
		double mediaF = somaf / contadorf;
		System.out.println(soma);
		System.out.println(somaf);
		System.out.println("A media feminina é de " + mediaF);
		System.out.println("A media geral é de " + mediaG);
	}
}