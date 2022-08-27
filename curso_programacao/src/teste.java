import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario,imposto;
		System.out.println("Digite seu salário: ");
		salario = sc.nextDouble();
		
		if (salario<2000.01) {
			imposto = 0.0;
		}
		else
			imposto = 110.0;
		if (imposto==0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("FODASE");
		}
		
		System.out.printf("R$%.2f",imposto);
		sc.close();
	}

}
