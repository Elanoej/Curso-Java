package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		double soma = 0;
		double count = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			 if (vetor[i]%2==0) {
				 soma += vetor[i];
				 count +=1;
			 }
		}
		if (count==0) {
			System.out.println("Nenhum número par");
		}
		else {
		double mediapar = soma/count;
		System.out.printf("Media dos pares = %.1f",mediapar);
		}
sc.close();
	}

}
