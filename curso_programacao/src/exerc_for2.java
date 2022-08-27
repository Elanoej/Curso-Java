import java.util.Scanner;
public class exerc_for2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i1 = 0;
		int i2 = 0;
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			if (x>=10&&x<=20) {
				i1+=1;
			}
			else
				i2+=1;
			}
		System.out.println(i1+" in");
		System.out.println(i2+" out");
sc.close();
	}

}
