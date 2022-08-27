package application;

import java.util.Scanner;

import entitties.Client;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		sc.nextLine();

		Client[] clientes = new Client[10];

		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d%n",i+1);
			System.out.printf("Name: %n");
			String name = sc.nextLine();
			System.out.printf("Email: %n");
			String email = sc.nextLine();
			System.out.printf("Room: %n");
			int room = sc.nextInt();
			sc.nextLine();
			clientes[room] = new Client(name,email,room);
		}
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (clientes[i]!=null) {
				System.out.println(clientes[i].toString());
			}
		}
		sc.close();
	}

}
