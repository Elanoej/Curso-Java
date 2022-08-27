package application;

import java.util.Locale;
import java.util.Scanner;

import entities.height;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 0;
		int agecount = 0;
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		height[] vect = new height[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			System.out.printf("Nome: %n");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Idade: %n");
			int age = sc.nextInt();
			System.out.printf("Altura: %n");
			double height = sc.nextDouble();
			vect[i] = new height(name, age, height);
			media += vect[i].getHeight() / vect.length;
		}
		System.out.printf("Altura média: %.2f%n", media);

		for (int i = 0; i < n; i++)
			if (vect[i].getAge() < 16) {
				agecount += 1;
			}
		double percentage = (agecount * 100) / vect.length;
		System.out.print("Pessoas com menos de 16 anos: ");
		System.out.println(percentage + "%");
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}
}