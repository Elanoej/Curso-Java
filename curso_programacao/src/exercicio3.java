import java.util.Locale;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int a,b,c,d,dif;
		System.out.println("Digite os valores: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		dif = a*b-c*d;
		System.out.println("Diference: "+dif);
		
		
		
		
		sc.close();
	}

}
