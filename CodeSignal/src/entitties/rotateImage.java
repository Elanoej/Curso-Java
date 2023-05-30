package entitties;

public class rotateImage {
	
	public static int[][] solution(int[][] a) {
	    int[][] result = new int[a[0].length][a.length];
	    //int[][] pre = new int [a[0].length][a.length];
	    
	    for(int i = 0; i < result[0].length; i++) {
	    	for(int j = 0; j < result.length; j++) {
	    		result[i][j] = a[result.length-j-1][i];
	    	}
	    }
	    return result;
	}
}
