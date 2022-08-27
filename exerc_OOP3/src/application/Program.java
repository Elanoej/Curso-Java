package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student a = new Student();
		a.name = sc.nextLine();
		a.nota1 = sc.nextDouble();
		a.nota2 = sc.nextDouble();
		a.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n",a.media());
		if (a.media()>=60) {
			System.out.println("PASS!");
		}
		else 
			System.out.printf("Failed! %nMissing %.2f",60-a.media());
		
sc.close();
	}

}
