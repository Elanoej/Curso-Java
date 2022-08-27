package application;

import java.util.Scanner;

import entitties.Persons;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String name;
		int age;
		Persons[] vetor = new Persons[n];
		String maisvelha="a";
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n",i+1);
			System.out.print("Nome: ");
			name = sc.next();
			System.out.print("Idade: ");
			age = sc.nextInt();
			vetor[i] = new Persons(name, age);
		}
		
		int comparador = vetor[0].getAge();
		
		for (int i = 0; i < n; i++) {
			if (vetor[i].getAge() > comparador) {
				comparador = vetor[i].getAge();
				maisvelha = vetor[i].getName();
			}
		}
		System.out.printf("Pessoa mais velha: %s",maisvelha);
		sc.close();
	}

}
