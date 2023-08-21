import java.util.Scanner;

public class IfeElse16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("quantas horas voce trabalhou nesse mes?");
		double HoraspMes = input.nextDouble();
		System.out.println("Quanto voce recebe por hora?");
		double SalpHora = input.nextDouble();
		double HoraEx = ((SalpHora * 50)/ 100);
		double SalpMes = (SalpHora * 160);
		double SalFin = (SalpMes + HoraEx );
		if (HoraspMes / 4 > 40) {
			System.out.println("Voce vai receber "+ HoraEx +" de hora extra, seu salario total sera de " + SalFin);
		}
		
		
		
	
	}

}
