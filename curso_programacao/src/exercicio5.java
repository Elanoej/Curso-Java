import java.util.Locale;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int p1,p2,n1,n2;
		double v1,v2,vt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Product code: ");
		p1 = sc.nextInt();
		System.out.println("Quantity: ");
		n1 = sc.nextInt();
		System.out.println("Unity value: ");
		v1 = sc.nextDouble();
		System.out.println("Product code: ");
		p2 = sc.nextInt();
		System.out.println("Quantity: ");
		n2 = sc.nextInt();
		System.out.println("Unity value: ");
		v2 = sc.nextDouble();
		vt = n1*v1+n2*v2;
		System.out.printf("Value to pay: %.2f",vt);
				
		sc.close();
	}

}
