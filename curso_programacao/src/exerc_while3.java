import java.util.Scanner;
public class exerc_while3 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);	
		int a,ava,avg,avd;
		ava = 0;
		avg = 0;
		avd = 0;
		a=0;
		while (a>1||a<4) {
			a = sc.nextInt();
			if (a == 1) {
				ava += 1;			
			}
			else if (a==2) {
				avg+= 1;
			}
			else if (a==3) {
				avd+= 1;
			}
			else if (a==4) {
				break;
			}	
		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: "+ava);
		System.out.println("Gasolina: "+avg);
		System.out.println("Diesel: "+avd);
		sc.close();
	}

}
