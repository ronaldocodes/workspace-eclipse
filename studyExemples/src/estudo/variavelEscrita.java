package estudo;

import java.util.Locale;

public class variavelEscrita {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		
	int y = 5;
	double x = 40.42323303;
	String nome = "Maria";
	System.out.println(y);
	System.out.println("Hello World");
	System.out.println(x);
	System.out.printf("%.2f%n", x);
	System.out.printf("%.4f%n", x);
	System.out.println("RESULTADO " + y + " METROS ");
	System.out.printf("Primeiro Numero = %.2f metros%n", x);
	System.out.printf("%s tem %d anos e ganha %.2f dinheiros%n", nome, y, x);	
	
	}

}
