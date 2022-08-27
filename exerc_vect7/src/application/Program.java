package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double soma=0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		double media=0;
		media = soma/vetor.length;
		System.out.printf("M�dia do vetor = %.3f%n",media);
		System.out.println("Elementos abaixo da m�dia: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i]<media) {
				System.out.println(vetor[i]);
			}
		}
sc.close();
	}

}
