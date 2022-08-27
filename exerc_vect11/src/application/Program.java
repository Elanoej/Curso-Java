package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: %n",i+1);
			double alturatemp = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: %n",i+1);
			char generotemp = sc.next().charAt(0);
			altura[i] = alturatemp;
			genero[i] = generotemp;
		}
		
		double comparadormaior = 0 ;
		double comparadormenor = altura[0] ;
		double soma = 0;
		int divisor = 0;
		int contador=0;
		
		for (int i = 0; i < n; i++) {
			if (altura[i]>comparadormaior) {
				comparadormaior = altura[i];
			}
			if (altura[i]<comparadormenor) {
				comparadormenor = altura[i];
			}
			if (genero[i]=='F'||genero[i]=='f'){
				divisor ++;
				soma += altura[i];
			}
			if (genero[i]=='M'||genero[i]=='m') {
				contador ++;
			}
		}
		
		double media = soma/divisor;
		System.out.printf("Menor altura = %.2f%n",comparadormenor);
		System.out.printf("Maior altura = %.2f%n",comparadormaior);
		System.out.printf("Media das alturas das mulheres = %.2f%n",media);
		System.out.printf("Número de homens = %d%n",contador);
	sc.close();	
	}
}
