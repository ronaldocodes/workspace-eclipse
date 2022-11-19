package estudo;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	String name1, name2, name3;
	double num1, num2, num3; 
	num1 = sc.nextDouble();
	num2 = sc.nextDouble();
	num3 = sc.nextDouble();
	
	name1 = sc.next();
	name2 = sc.next();
	name3 = sc.next();
	
	
	System.out.printf("%s, %s, %s%n", name1, name2, name3);
	System.out.printf("%.2f, %.2f, %.2f", num1, num2, num3);

	sc.close();
	}

}
