import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual é o seu Numero de funcionario? ");
		String Numero = input.next();
		System.out.println("Quantas horas vc tem trabalha por dia? ");
		Double HorasTrabalhadas = input.nextDouble();
		System.out.println("Quanto voce recebe por hora? ");
		Double DinheiroPorHora = input.nextDouble();
		Double Salario = (DinheiroPorHora * HorasTrabalhadas) * 30;
		System.out.println("O numero do funcionario é: " + Numero);
		System.out.println("O funcionario recebe " + Salario + " R$ por mes");

	}

}
