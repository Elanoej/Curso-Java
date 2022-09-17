package application;

import java.util.Scanner;

import entitties.Matriz;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas a matriz ter�? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas a matriz ter�? ");
		int n = sc.nextInt();
		Matriz matriz = new Matriz(m, n);

		System.out.println("Digite os n�meros pra entrar na matriz: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz.add(i, j, sc.nextInt());
			}
		}
		
		System.out.println("O cofator de a13: " + matriz.cofator(1, 3));
		
		System.out.println("O valor na posi��o 2x1: " + matriz.getValue(2, 1));
		System.out.println("Determinante da matriz: ");
		System.out.println(matriz.determinante());
		
		sc.close();
	}

}
