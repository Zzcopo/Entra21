import java.util.Scanner;

public class LacoRep1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
			for(int i = 0; i <=4; i++){
		System.out.println("Insira um numero");
		int numero = input.nextInt();
		if(numero % 2 ==0 ) {
			System.out.println("Numeor par");
		} else System.out.println("Numero impar"); 
	
	
	}
}
}