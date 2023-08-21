import java.util.Scanner;

public class IfeElse4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean dataValida = false;
		System.out.println("Insira o dia");
		int dia = input.nextInt();
		if (dia >= 1 && dia <= 31) {
			System.out.println("Insira o mes");
			int mes = input.nextInt();

			if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30
					|| (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
					|| mes == 2 && dia <= 29) {
				System.out.println("Insira o ano");
				int ano = input.nextInt();
				dataValida = true;
				
				if((mes == 2 && dia == 29 && ano % 4 != 0)) {
					dataValida = false;
				System.out.println("Data invalida");
				} else {
					System.out.println("a data " + dia + "/" + mes + "/" + ano + " é valida");
				}
				
			}

		
		}
		
	}
}
