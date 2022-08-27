import java.util.Scanner;

public class exercicioconditionally1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Type a number: ");
		a = sc.nextInt();
		if (a>0) {
			System.out.printf("Positive");
		}
		else { 
			System.out.printf("Negative");
			
		}
sc.close();
}
}
