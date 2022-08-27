package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.Employee;
import entitties.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be added? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char response = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			if (response == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(employee);
			} else {
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}
		}
		System.out.println("PAYMENTS:");
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
		sc.close();
	}
}
