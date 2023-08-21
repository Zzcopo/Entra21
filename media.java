import java.text.DecimalFormat;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Diga a nota 1");
		double Nota1 = input.nextDouble();
		System.out.println("Diga a nota 2");
		double Nota2 = input.nextDouble();
		System.out.println("Diga a nota 3");
		double Nota3 = input.nextDouble();
		
		double media = (Nota1 + Nota2 + Nota3) /3;
		
		System.out.println("A media é de :" + df.format(media));
		
	}

}
