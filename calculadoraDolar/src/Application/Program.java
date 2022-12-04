package Application;

import java.util.Locale;
import java.util.Scanner;

import Util.conversor;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do dolar: ");
		Double dolarValor = sc.nextDouble();
		System.out.println("Digite o valor em dolar a ser comprado: ");
		Double compraDolar = sc.nextDouble();
		double valorConvertido = conversor.conversor(dolarValor, compraDolar);
		System.out.printf("O valor que deverá ser pado é de %.2f%n", valorConvertido);

		sc.close();

	}

}
