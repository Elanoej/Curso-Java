import java.util.Scanner;

public class Função {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(fatorial(sc.nextInt()));

	}

	public static int fatorial(int n) {
		int result =1;
		
		for(int i =n;i>1;i--) {
			result*=i;
		}
		
		return result;
	}
}