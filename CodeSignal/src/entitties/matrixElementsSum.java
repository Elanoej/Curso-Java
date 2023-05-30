package entitties;

public class matrixElementsSum {
	//22 minutos pra fazer
	public static int solution(int[][] matrix) {
		int sum = 0;
		int[] par = new int[2];
		for(int i=0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					par[0] = i;
					par[1] = j;
					for(int k =0; k < matrix.length-i; k++) {
						matrix[i+k][j] = 0;
					}
				}	
			}
		}
		for(int i = 0; i < matrix.length; i ++) {
			for(int j = 0; j < matrix[0].length; j++) {
				sum+= matrix[i][j];
			}
		}
		return sum;
	}
	
	
}
