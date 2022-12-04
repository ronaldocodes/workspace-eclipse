package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculador;

public class program {


	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		
		System.out.println("Digite o valor do raio");
		double raio = sc.nextDouble();
		double c = calculador.circuferencia(raio);
		double v = calculador.volume(raio);

		System.out.printf("Circuferencia: %.2f%n ", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("Valor do PI: : %.2f%n ", calculador.PI);

		sc.close();

	} 
	

}
