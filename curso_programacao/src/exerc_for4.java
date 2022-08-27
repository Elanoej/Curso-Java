import java.util.Locale;
import java.util.Scanner;

public class exerc_for4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double a = 0;
		double b = 0;
		double div = 0;
		for (int i = 0; i<n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			div = a/b;
			if (b!=0) {
				System.out.printf("%.1f%n",div);
			}
			else
				System.out.println("divisao impossivel");
		}	
sc.close();	
	}
}