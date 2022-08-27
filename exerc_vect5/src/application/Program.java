package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];

		int posmaior = 0;
		double maior = vect[0];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posmaior = i;
			}
		}
		System.out.printf("Maior valor: %.1f%n", maior);
		System.out.printf("Posição do maior valor: %d%n", posmaior);
		sc.close();
	}
}
