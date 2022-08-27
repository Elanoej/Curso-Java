import java.util.Scanner;

public class exerc_for7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		int iqua,icub;
		for (int i=1; i<=n; i++) {
			iqua = i*i;
			icub = i*i*i;
			System.out.printf("%d %d %d %n", i , iqua, icub);
		}
sc.close();
	}

}
