package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Type N number: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int negativenumbers = 0 ;
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j]<0) {
					negativenumbers++;
				}
			}
		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n ; i++) {
			System.out.printf("%d ",mat[i][i]);
		}
		System.out.println();
		System.out.printf("Negative numbers = %d%n", negativenumbers);
				
		
		
	sc.close();
	}

}
