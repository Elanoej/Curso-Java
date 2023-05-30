import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[10][3];
		int value = sc.nextInt();
		int linhapar = 0;
		int linhaimpar = 0;
		int temp = 0;
		
		while (value != -1) {
			if (linhapar < 10) {
				if (value % 2 == 0) {
					for (int i = 0; i < mat[2].length; i++) {
						mat[i][2] = value;
					}
					linhapar++;
				}
			}
			if (linhaimpar < 10) {
				if (value % 2 != 0) {
					for (int i = 0; i < mat[0].length; i++) {
						mat[i][0] = value;
					}
					linhaimpar++;
				}
			}

			if (linhapar >= 10) {
				temp=mat[2][0];
				for (int i = 0; i < mat[0].length-1; i++) {
					mat[2][i]=mat[2][i+1];
				}
				for (int i = 1; i < mat[0].length-1; i++) {
					mat[1][i]=mat[1][i-1];
				}
				mat[1][mat[0].length-1]=temp;
			}

			value=sc.nextInt();
		}
		
		for(int i =0; i<mat.length;i++) {
			for(int j = 0; j<mat[0].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
