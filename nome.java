import java.util.Scanner;

public class nome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual � seu nome? ");
		String Nome = input.next();
		System.out.println("Qual � seu sobrenome? ");
		String Sobrenome = input.next();
	
		System.out.println("Seu nome �: " + Nome + " " + Sobrenome);
	}

}
