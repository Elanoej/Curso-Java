import java.util.Scanner;

public class exerc_condit_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora de inicio e término do jogo: ");
		int hi, ht,dt;
		hi = sc.nextInt();
		ht = sc.nextInt();
		if (hi<ht) {
			dt = ht-hi; 
		}
		else {
			dt = 24-hi+ht;
		}
		System.out.printf("O jogo durou %d hora(s).",dt);
								
sc.close();
	}
}
