package exercicios;

import java.util.Locale;

public class e01 {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	
	String product1 = "Computer";
	String product2 = "Mouse";
	
	String name = "Maria";
	int age = 23;
	int code = 5290;
	char gender = 'F';
	 
    double price1 = 2100.00;
    double price2 = 32.00;
    
    System.out.println("Buy List");
    System.out.printf("%s price : %.2f%n", product1, price1);
    System.out.printf("%s price : %.2f%n", product2, price2);
    
    System.out.println("Client Status");
    System.out.printf("Name %s - gender %s - age %d - userCode %d", name, gender, age, code);
    
		
	}

}
