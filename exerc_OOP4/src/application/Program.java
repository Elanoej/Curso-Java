package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		CurrencyConverter a = new CurrencyConverter();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		a.dollarPrice = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		a.dollarBuying = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f ",a.paidReais());
		
	sc.close();	
	}

}
