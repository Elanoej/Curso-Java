import java.util.Scanner;
public class exerc_for5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fat=1;
		for (int i=0; n>i ;i++) {
			fat=fat*(n-i);
		}
		System.out.println(fat);
sc.close();		
	}

}
