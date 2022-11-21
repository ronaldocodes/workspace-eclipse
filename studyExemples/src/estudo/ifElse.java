package estudo;

import java.util.Locale;
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero até 10: ");
		double nun = sc.nextDouble();

		if (nun > 10) {
			System.out.println("Numero invalido!");
		} else if (nun <= 5) {
			System.out.println("Numero menor que 6");
		} else {
			System.out.println("Numero maior que 5");
		}

		sc.close();
	}

}
