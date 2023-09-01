import java.util.Scanner;

public class Vetor4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valores [] = new int[100];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("["+i+"] = "+ i * i );
		}
	}
}
