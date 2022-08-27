package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle widht and height: ");
		Rectangle a = new Rectangle();
		a.widht = sc.nextDouble();
		a.height = sc.nextDouble();
		System.out.printf("Area = %.2f%n",a.area());
		System.out.printf("Perimeter = %.2f%n",a.perimeter());
		System.out.printf("Diagonal = %.2f%n",a.diagonal());
sc.close();
	}

}
