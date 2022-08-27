import java.util.Scanner;
import java.util.Locale;
public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a,b,c,tr,cr,tt,tp,sqr,rt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		tr = ((a*c)/2);
		tt = 3.14159;
		cr = c*c*tt;
		tp = ((a+b)/2)*c;
		sqr = b*b;
		rt = a*b;
		
		System.out.printf("Triangule: %.3f%n",tr);
		System.out.printf("Circle: %.3f%n",cr);
		System.out.printf("Trapeze: %.3f%n",tp);
		System.out.printf("Square: %.3f%n",sqr);
		System.out.printf("Rectangle: %.3f%n",rt);
		
		sc.close();
	}

}
