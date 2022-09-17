package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitties.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		String path = "C:\\temp\\input.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String[] splited = line.split(",");
				Double splitedValue = Double.parseDouble(splited[1]);
				products.add(new Product(splited[0], splitedValue));
				line = br.readLine();
			}
			
			Product max = CalculationService.max(products);
			System.out.println("MAX: ");
			System.out.println(max.toString());

		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
	}
}
