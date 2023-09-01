import java.util.Scanner;

public class LacoRep7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
double soma = 0;
int contador = 0;
double num1 = 1;

System.out.println("Qual e o seu numero de inscrição (digite 0 para finalizar)?");
num1 = input.nextDouble();
System.out.println("digite a altura?");
double altura = input.nextDouble();
double maiorAlt = 0;
double menorAlt = altura ;
double inscMatl = 0;
double inscMenAtl = num1;



while (num1 != 0) {
	if (altura > maiorAlt) {
		maiorAlt = altura;
	inscMatl = num1;
	}
	 if ( altura < menorAlt) {
		menorAlt = altura;
		inscMenAtl = num1;
	}		
	
	
		soma += altura;
		contador++;
		System.out.println("qual é seu numero de inscrição ?" );
		num1 = input.nextDouble(); 
		if (num1 == 0) {
			break;
		}
		
		System.out.println("digite a altura ?");
		altura = input.nextDouble();
}
	
	
	System.out.println("o maior atleta tem " + maiorAlt +" de altura e a inscrição é de " + inscMatl);
	System.out.println("o menor atleta tem " + menorAlt +" de altura e a inscrição é de " + inscMenAtl);
	

double media = soma / contador;
 System.out.printf("a media da altura é %.2f" , media);
}
}
