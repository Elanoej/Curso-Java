import java.util.Locale;
import java.util.Scanner;
public class exercicio4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double ht,rh,sl;
		System.out.println("Type the values:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ht = sc.nextDouble();
		rh = sc.nextDouble();
		sl = ht*rh;
		System.out.println("Number: "+n);
		System.out.printf("Salary: %.2f",sl);
		
		sc.close();
	}

}