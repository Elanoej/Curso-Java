import java.util.Scanner;

public class exerc_cond_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int a = sc.nextInt();
		if (a%2==0) {
			System.out.printf("PAR");
		}	
		else {
			System.out.printf("Impar");
			}
											
	sc.close();
	}

}
