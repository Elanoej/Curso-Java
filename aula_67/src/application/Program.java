	package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product a = new Product();
		System.out.println("Enter product data: ");
		System.out.printf("Name: %n");
		a.setName(sc.next()); 
		System.out.println("Price: ");
		a.setPrice(sc.nextDouble());
		System.out.println("Quantity in stock: ");
		a.setQuantity(sc.nextInt());
		
		System.out.println("Product data: "+a.toString());
		System.out.println("Enter the number of products to be added in stock: ");
		a.addProduct(sc.nextInt());
		System.out.println("Uptated data: "+ a.toString());
		System.out.println("Enter the number of products to be removed from stock: ");
		a.removeProduct(sc.nextInt());
		System.out.println("Uptated data: "+ a.toString());
		
sc.close();
	}

}
