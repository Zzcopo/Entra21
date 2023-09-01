import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	
	System.out.println("Diga uma fruta");
	String fruta = input.next();
			
	switch(fruta) { 
	case "banana":
		System.out.println("Eu gosto dessa fruta");
	break;
	
	case "uva": 
		System.out.println("Eu nao gosto dessa fruta");
	break;
	case "maca":
		System.out.println("Eu gosto dessa fruta");
	break;
	case "tamarindo":
		System.out.println("Eu nunca comi essa fruta");
	break;
		default:
			System.out.println("Não conheço essa fruta");
	break;
		}
}
}