import java.util.Locale;
import java.util.Scanner;

public class exerc_condit_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario;
		double valorf;
		System.out.println("Digite seu salário: ");
		salario = sc.nextDouble();
		if (salario<2000.01) {
			System.out.printf("Isento");
		}
		else if (salario<3000.01) {
			valorf = salario+(salario*8/100);
			System.out.printf("R$%.2f",valorf);
		}
		else if (salario<4500.01) {
			valorf = (1000)*8/100+(salario-3000)*18/100;
			System.out.printf("R$%.2f",valorf);
		}
		else {
			valorf = (1000)*8/100+(1499.99)*18/100+(salario-4500)*28/100;	
		}
	sc.close();	
	}
}
