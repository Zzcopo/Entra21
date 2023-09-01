import java.util.Scanner;

public class Vetor6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor [] = new int[4];
		
		
		
		
		valor[0] = 10;
		valor[1] = 7;
		valor[2] = 5;
		valor[3] = 22;
	for (int i = 0; i < valor.length; i++) {
		System.out.println("qual indicie voce quer editar? [" + i +"] = " + valor[i]);
		}	
	
	int ind = input.nextInt();
	System.out.println("Qual numero voce quer botar nesse indicie?");
	int edit= input.nextInt();
	
	switch(ind) {
		case(0):
			valor[0] = edit;
		System.out.println("[0] = " + valor[0] + "  [1] = " + valor[1] + "  [2] = " + valor[2] + " [3] =" + valor [3] );
	break;
		case(1):
			valor[1] = edit;
		System.out.println("[0] = " + valor[0] + "  [1] = " + valor[1] + "  [2] = " + valor[2] + " [3] =" + valor [3] );
	break;
		case(2):
			valor[2] = edit;
		System.out.println("[0] = " + valor[0] + "  [1] = " + valor[1] + "  [2] = " + valor[2] + " [3] =" + valor [3] );
	break;
		case(3):
			valor[3] = edit;
		System.out.println("[0] = " + valor[0] + "  [1] = " + valor[1] + "  [2] = " + valor[2] + " [3] =" + valor [3] );
	break;
	
	
	}
	
	
	
	
	
	}

}
