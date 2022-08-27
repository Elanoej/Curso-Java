import java.util.Locale;
import java.util.Scanner;

public class exerc_condit_7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite os pares ordenados: ");
		Scanner sc = new Scanner(System.in);
		double x,y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (x>0&&y>0) {
			System.out.println("Q1");
		}
		else if (x<0&&y>0) {
			System.out.println("Q2");
		}
		else if (x<0&&y<0) {
			System.out.println("Q3");
		}
		else if (x>0&&y<0) {
			System.out.println("Q4");
		}
		else if (y==0&&x!=0) {
			System.out.println("Eixo X");
		}
		else if (x==0&&y!=0) {
			System.out.println("Eixo Y");
		}
		else 
			System.out.println("Origem");
sc.close();
	}

}
