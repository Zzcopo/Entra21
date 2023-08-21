import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Qual a primeira nota? ");
	double Nota1 = input.nextDouble();
	System.out.println("Qual a segunda nota? ");
	double Nota2 = input.nextDouble();
	double Media = (Nota1 * 0.35) + (Nota2 * 0.65);
	
	System.out.printf("A media ponderada de " + Nota1 + " e " + Nota2 + " é:  %.2f" , Media);

	
	}	
}
