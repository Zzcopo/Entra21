import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Diga um numero");
		int numero = input.nextInt();
		System.out.println("Diga outro numero");
		int numero2 = input.nextInt();
		
		System.out.println("digite 1 caso queira somar os dois n�meros, digite 2 Caso queira que subtraia os dois n�meros, digite 3 Caso queira que multiplique os dois n�meros, digite 4 Caso queira quer divida os dois n�meros");
		int calc = input.nextInt();
		
		
		switch(calc) {
		case 1:
			System.out.println("O a soma � " + (numero + numero2));
			break;
		case 2:
			System.out.println("O subtra��o � " + (numero - numero2));
			break;
		case 3:
			System.out.println("A multiplica��o � " + (numero * numero2));
			break;
		case 4:
			System.out.println("A divis�o � " + (numero / numero2));
				break;
		}

}
}