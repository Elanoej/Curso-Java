import java.util.Scanner;
public class exerc_while1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		int senha;
		senha= sc.nextInt();
		
		while (senha!=2002) {
			System.out.println("Senha inválida.");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido.");
sc.close();		
	}

}
