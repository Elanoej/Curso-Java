package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas linhas a matriz terá? ");
		int m = sc.nextInt();
		System.out.println("Quantas colunas a matriz terá? ");
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];

		System.out.println("Digite os números pra entrar na matriz: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite um número que pertença a matriz: ");
		int pert = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == pert) {
					System.out.printf("Position %d,%d%n", i, j);
					if (j != 0) {
						System.out.printf("Left: %d%n", matriz[i][j - 1]);
					}
					if (i != 0) {
						System.out.printf("Up: %d%n", matriz[i - 1][j]);
					}
					if (j < matriz.length) {
						System.out.printf("Right: %d%n", matriz[i][j + 1]);
					}
					if (i < matriz[i].length) {
						System.out.printf("Down: %d%n", matriz[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
