package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.Company;
import entitties.Individual;
import entitties.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxpayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Individual or company (i/c)? ");
			char response = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double anuaIncome = sc.nextDouble();
			sc.nextLine();
			if (response == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				taxpayers.add(new Individual(name, anuaIncome, healthExpenditures));
			} else if (response == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				sc.nextLine();
				taxpayers.add(new Company(name, anuaIncome, numberOfEmployees));
			}
		}
		System.out.println("");
		System.out.println("TAXES PAID:");
		Double sum = 0.0;
		for (TaxPayer tp : taxpayers) {
			System.out.println(tp.toString());
			sum += tp.taxesPaid();
		}
		System.out.println("");
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		sc.close();
	}

}
