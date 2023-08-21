import java.util.Scanner;

public class MeuSegundoPrograma {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		

			
		
		
		System.out.println("qual o numero um? ");
		int NumeroUm = input.nextInt() ;
		System.out.println("qual o numero dois? ");
		int NumeroDois = input.nextInt() ;
		System.out.println("qual o numero tres? ");
		int NumeroTres = input.nextInt();
		
		int Soma1 = NumeroUm + NumeroDois;
		int Soma2 = Soma1 * NumeroTres;
		
		System.out.println("o resultado é " + Soma2);
		
	}

}
