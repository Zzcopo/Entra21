
// Crie uma array de 5 elementos e imprima os �ltimos elementos por primeiro
import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int elementos[] = new int [5];
		System.out.println("Quai sao os elementos? (numeros)");
		elementos[0] = input.nextInt();
		elementos[1] = input.nextInt();
		elementos[2] = input.nextInt();
		elementos[3] = input.nextInt();
		elementos[4] = input.nextInt();
	
		System.out.println("A idade do competidor � : " + elementos[4]);
		System.out.println("A idade do competidor � : " + elementos[3]);
		System.out.println("A idade do competidor � : " + elementos[2]);
		System.out.println("A idade do competidor � : " + elementos[1]);
		System.out.println("A idade do competidor � : " + elementos[0]);
		}
}
