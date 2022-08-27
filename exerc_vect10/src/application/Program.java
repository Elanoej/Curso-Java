package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Student[] vetor = new Student[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n",i+1);
			sc.nextLine();
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vetor[i] = new Student(name,nota1,nota2);
		}
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].media()>=6) {
				System.out.println(vetor[i].getName());
			}
		}
sc.close();
	}
}
