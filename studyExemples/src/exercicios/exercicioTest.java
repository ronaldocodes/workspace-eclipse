package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicioTest {

	
		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros:");
		double n1 = sc.nextInt();
		double n2 = sc.nextDouble();	
		if(n1 >= n2) {
			System.out.printf("%.2f%n é maior que %.2f%n ", n1,n2 );
		}else {
			System.out.printf("%.2f%n é maior que %.2f%n", n2, n1);
		}
		
		
		sc.close();

	}
	}

