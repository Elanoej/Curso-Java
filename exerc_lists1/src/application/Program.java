package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		List<String> names = new ArrayList<>();
		List<Integer> ids = new ArrayList<>();
		List<Double> salarys = new ArrayList<>();
		double percentage;
		char checkid = 'f';

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			System.out.println("ID: ");
			ids.add(sc.nextInt());
			sc.nextLine();
			System.out.println("Name: ");
			names.add(sc.nextLine());
			System.out.println("Salary: ");
			salarys.add(sc.nextDouble());
			sc.nextLine();
		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int salaryidup = sc.nextInt();
		for (Integer x : ids) {
			if (x == salaryidup) {
				checkid = 'v';
			} else {
				checkid = 'f';
			}
		}
		if (checkid == 'v') {
			for (int i = 0; i < n; i++) {
				if (salaryidup == ids.get(i)) {
					System.out.println("Enter the percentage: ");
					percentage = sc.nextDouble();
					salarys.add(i, salarys.get(i) + (salarys.get(i) * percentage / 100));
				}
			}
		} else if (checkid == 'f') {
			System.out.println("This ID does not exist!");
		}
		System.out.println();
		System.out.println("List of employees:");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d, %s, %.2f%n", ids.get(i), names.get(i), salarys.get(i));
		}
		sc.close();
	}

}
