// todos as variaveis que começaam com A sao as areas e o numero do lado é de q area é ex: At = area do triangulo

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o valor da Base do lado A? ");
		double A = input.nextDouble();
		System.out.println("Qual o valor do lado B? ");
		double B = input.nextDouble();
		System.out.println("Qual é o valor do lado C? ");
		double C = input.nextDouble();
		double At = (A * C) / 2;
		double Ac = (C * C) / Math.PI;
		double Atr = ((A + B) * C) / 2;
		double Aq = B * B;
		double Re = A * B;

		System.out.println("A area do triangulo retangulo com a base no valor A e a altura no valor C é de " + At);

		System.out.printf("A base do circulo de Raio no valor C é de  %.2f %n", Ac);

		System.out.printf("A area do trapezio que tem A e B por bases e C por altura é: %.2f %n", Atr);

		System.out.println("A area do quadrado que tem os lado B é de: " + Aq);

		System.out.println("A area do retangulo que tem lados A e B é de: " + Re);

	}

}
