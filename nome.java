import java.util.Scanner;

public class nome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é seu nome? ");
		String Nome = input.next();
		System.out.println("Qual é seu sobrenome? ");
		String Sobrenome = input.next();
	
		System.out.println("Seu nome é: " + Nome + " " + Sobrenome);
	}

}
