package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entitties.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				products.add(new Product(name, price));
				line = br.readLine();
			}
			
			double avg = products.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / products.size();
			
			System.out.println("Average price : " + String.format("%.2f", avg));
			
			Comparator<String> comp = (s1 , s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = products.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	sc.close();
	}

}
