package application;

import java.util.Locale;
import java.util.Scanner;

import model.entitties.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
			sc.close();
		}

		catch (DomainException e) {
			System.out.println(e.getMessage());
		}

	}

}
