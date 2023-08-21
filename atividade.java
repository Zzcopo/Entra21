import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("qual a area do circulo ? ");
		
		double area = input.nextDouble();
		double calculo = area * area * Math.PI;
		
		
		System.out.println("O perimetro é: " + calculo);
		
		
		
		
		
	}

}
