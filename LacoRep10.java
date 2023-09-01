
import java.util.Scanner;
public class LacoRep10 {





	public static void main(String[] args) {
			
		int Idade18 = 0;
		int contador = 0;
		String contadorN = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		int n = input.nextInt();
		
		for( int i = 1; i <= n; i++ ) {
		System.out.println("Digite o nome do aluno?");
		String nome = input.next();
		
		
		
		System.out.println("Qual a idade do aluno?");
		int idade = input.nextInt();
		
		if (idade >= 20) {   
		contador++;
		
		} if (idade == 18) { 
			contadorN += nome + " ";
			
			
		}
	
		}
		System.out.println("a sala possui " + contador + " alunos com 20 anos ou mais ");
		System.out.println("o nome dos alunos que tem 18 anos sao: " + contadorN );
	}

}