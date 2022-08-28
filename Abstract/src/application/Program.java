package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.Circle;
import entitties.Rectangle;
import entitties.Shape;
import entitties.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Shape> shapes = new ArrayList<>();
		
		for (int i = 1 ; i <= n ; i++) {
			System.out.print("Shape #" + i + " data: \n");
			System.out.print("Rectangle or Circle (r/c)? ");
			char response = sc.nextLine().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.nextLine());
			if (response == 'r') {
				System.out.print("Widht: ");
				Double widht = sc.nextDouble();
				sc.nextLine();
				System.out.print("height: ");
				Double height = sc.nextDouble();
				sc.nextLine();
				shapes.add(new Rectangle(color, widht, height));
			} else if (response == 'c') {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				sc.nextLine();
				shapes.add(new Circle(color, radius));
			}	
		}
		
		System.out.println("SHAPE AREAS: ");
		for (Shape s : shapes) {
			System.out.println(String.format("%.2f", s.area()));
		}
		sc.close();
	}

}
