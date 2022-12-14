package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entitties.Contract;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date d01 = sdf1.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();

		Contract contract = new Contract(contractNumber, d01, contractValue);
		ContractService cs = new ContractService(new PaypalService());

		cs.processContract(contract, installments);

		System.out.println("Installments:");
		for (int i = 0; i < contract.getInstallmentSize(); i++) {
			System.out.println(contract.getInstallment(i).toString());
		}
		sc.close();
	}

}
