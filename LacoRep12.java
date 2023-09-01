import java.util.Scanner;

public class LacoRep12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Pares =0;
		int impares =0;
		
		for (int i = 0; i <= 1000; i++) {
			if( i % 2 == 0) {
			Pares += i;
		} else {
			impares+= i;
	}

}
		System.out.println("A soma dos numero pares é " + Pares );
		System.out.println("A soma dos numeros impares é " + impares );
	}
}