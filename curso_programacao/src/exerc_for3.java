import java.util.Scanner;
import java.util.Locale;
public class exerc_for3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); 
		double mediap = 0;
		double mediap1 = 0;
		double mediap2 = 0;
		double mediap3 = 0;
		for (int i=0; i<x; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			mediap = (a*2+b*3+5*c)/10;
			if (i==0) {
				 mediap1 = mediap;
			}
			else if (i==1) {
				 mediap2 = mediap;
			}
			else if (i==2) {
				mediap3 = mediap;
			}
		}
		System.out.printf("%.1f%n",mediap1);
		System.out.printf("%.1f%n",mediap2);
		System.out.printf("%.1f%n",mediap3);
sc.close();		
	}

}
