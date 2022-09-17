package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.PrintService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ps.addValue(sc.nextInt());
		}
		ps.print();
		System.out.println("First : " + ps.first());
		sc.close();
	}

}
