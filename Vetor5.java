import java.util.Iterator;
import java.util.Scanner;

public class Vetor5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int indicies[] = new int[5];

		indicies[0] = 5;
		indicies[1] = 4;
		indicies[2] = 33;
		indicies[3] = 17;
		indicies[4] = 6;

		for (int i = 0; i < indicies.length; i++) {
			System.out.println("Qual numero voce quer mudar? [" + i + "]  = " + indicies[i]);

		}
		int mudIn = input.nextInt();
		
		switch (mudIn) {
		case (0):
			indicies[0] = 0;
			System.out.println(indicies[0] + " " + indicies[1] + " " + indicies[2] + " " + indicies[3] + " " + indicies[4]);
			break;
		case (1):
			indicies[1] = 0;
			System.out.println(indicies[0] + " " + indicies[1] +" " + indicies[2] +" " + indicies[3] +" " + indicies[4]);
			break;
		case (2):
			indicies[2] = 0;
			System.out.println(indicies[0] +" " + indicies[1] + " " +indicies[2] + " " + indicies[3] +" " + indicies[4]);
			break;
		case (3):
			indicies[3] = 0;
			System.out.println(indicies[0] + " " +indicies[1] + " " +indicies[2] + " " +indicies[3] + " " +indicies[4]);
			break;
		case (4):
			indicies[4] = 0;
			System.out.println(indicies[0] + " " + indicies[1] + " " + indicies[2] + " " +indicies[3] + " " + indicies[4]);

		}

	}

}