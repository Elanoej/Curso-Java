import java.util.Scanner;

public class exerc_condit_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.printf("Digite os valores: %n");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a%b==0||b%a==0) {
			System.out.printf("Sao multiplos.%n");		
		}
		else {
			System.out.printf("Nao sao multiplos.%n");
		}
sc.close();
	}

}
