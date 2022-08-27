import java.util.Locale;
import java.util.Scanner;

public class exerc_conver_temp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		Double f;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			f = (9*c)/5+32;
			System.out.printf("Equivalente em Fahreinheit: %.1f %n",f);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
					
		} while( resp != 'n' );
sc.close();
	}

}
