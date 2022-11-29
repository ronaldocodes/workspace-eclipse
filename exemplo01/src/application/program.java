package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		product product = new product();
		System.out.println("Entre product data:");
		System.out.print("Name:  ");
		product.name = sc.nextLine();
		System.out.printf("Price:  ");
		product.price = sc.nextDouble();
		System.out.printf("Quantity in stock:   ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println(product);
		System.out.println();
		System.out.println("Enter number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		System.out.println();
		System.out.println("Enter number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		System.out.println();
		sc.close();

	}

}
