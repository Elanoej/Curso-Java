package application;

import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		System.out.println("Quantos n�meros voc� vai digitar: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		for (int i=0; i < n; i++) {
			System.out.println("Digite um n�mero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("N�meros pares: ");
		for (int i=0; i < n; i++) {
			if (vect[i]%2==0) {
				System.out.print(vect[i] + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.printf("Quantidade de pares = %d%n", count);
		
		sc.close();
	}

}
