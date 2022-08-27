package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		double sum = 0;
		double[] vect = new double[n];
		for (int i=0; i<n; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
		}
		System.out.printf("Valores: ");
		for (int i=0; i<n; i++) {
			System.out.printf(" %.2f",vect[i]);
			sum += vect[i] ;
		}
		System.out.println();
		double media = sum/n;
		System.out.printf("Soma = %.2f%n",sum);
		System.out.printf("Media = %.2f%n",media);
sc.close();
	}

}
