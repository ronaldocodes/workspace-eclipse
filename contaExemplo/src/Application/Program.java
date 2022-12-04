package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Entre com o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com o Usuario da Conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Tem um deposito incial ? (y/n) : ");
		char response = sc.next().charAt(0);
		if (response == 'y' || response == 'Y') {
			System.out.print("Entre com deposito incial: ");
			double inicialDeposit = sc.nextDouble();
			account = new Account(number, holder, inicialDeposit);
		} else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account Data");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre um valor para deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Atualizando dados da conta...");
		System.out.println();
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre um valor para saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Atualizando dados da conta...");
		System.out.println();
		System.out.println(account);
		
		sc.close();
	}
}
