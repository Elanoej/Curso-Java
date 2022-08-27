package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount a;

		System.out.printf("Enter account number: %n");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.printf("Enter account holder: %n");
		String name = sc.nextLine();
		System.out.printf("Is there na initial depoist (y/n)? %n");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.println("Enter initial depoist value: ");
			double initialDepoist = sc.nextDouble();
			a = new BankAccount(number, name, initialDepoist);
		}
		else {
			a = new BankAccount(number, name);
		}
		
		System.out.println("Account data:");
		System.out.println(a.toString());
		
		System.out.printf("Enter a deposit value: %n");
		a.deposit(sc.nextDouble());
		System.out.println("Updated data:");
		System.out.println(a.toString());
		
		System.out.printf("Enter a withdraw value: %n");
		a.withdraw(sc.nextDouble());
		System.out.println("Updated data:");
		System.out.println(a.toString());
	
sc.close();
	}

}
