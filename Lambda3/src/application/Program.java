package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		Double sala = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				employees.add(new Employee(name, email, salary));
				line = br.readLine();
			}
			
			employees.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
			
			Double sum = 0.0;
			for (Employee e : employees) {
				
				if(e.getSalary()>=sala) {
					System.out.println(e.getEmail());
				}
				if (e.getName().charAt(0) == 'M') {
					sum += e.getSalary();
				}
			}
			
			System.out.print("Sum of salary of people whose name starts with 'M': ");
			System.out.println(String.format("%.2f", sum));
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		sc.close();
	}

}
