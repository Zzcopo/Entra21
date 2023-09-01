import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int elementos[] = new int[5];
		int maiorEl = Integer.MIN_VALUE;
		int menorEl = Integer.MAX_VALUE;
		int media = 0;
		
		for (int i = 0; i < elementos.length; i++) {

			System.out.println("Qual é o elemento? (numeros)");
			elementos[i] = input.nextInt();
			
			menorEl = Math.min(menorEl, elementos[i]);
			maiorEl = Math.max(maiorEl, elementos[i]);
			media = ((elementos[0] + elementos[1] + elementos[2] + elementos[3] + elementos[4])/5);
	
		}
		System.out.println("A media dos valores é " + media);
		System.out.println("o maior valor é " + maiorEl);
		System.out.println("o menor valor é " + menorEl);
	}
	}
	
	
