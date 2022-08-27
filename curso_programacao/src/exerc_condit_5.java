import java.util.Locale;
import java.util.Scanner;

public class exerc_condit_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c,q;
		System.out.printf("Code: %n");
		c = sc.nextInt();
		System.out.printf("Quantidade: %n");
		q = sc.nextInt(); 
		if (c==1) {
			double v = 4.00*q;
			System.out.printf("Total: %.2f",v);
		}
		else if (c==2){
			double v = 4.50*q;
			System.out.printf("Total: %.2f",v);
		}
		else if (c==3){
			double v = 5.00*q;
			System.out.printf("Total: %.2f",v);
		}
		else if (c==4){
			double v = 2.00*q;
			System.out.printf("Total: %.2f",v);
		}
		else if (c==5){
			double v = 1.50*q;
			System.out.printf("Total: %.2f",v);
		}	
sc.close();		
	}	
}