package entitties;

public class almostIncreasingSequence {
	
	public static boolean solution(int[] sequence) {
		Integer[][] poss = new Integer[sequence.length][sequence.length];
		Integer[][] last = new Integer[sequence.length][sequence.length-1];

		for(int i = 0; i < poss.length; i++) {
			for(int j = 0; j < poss[0].length; j++) {
				poss[i][j] = sequence[j];
			}
		}
		
		for(int i = 0, x = 0; i < last.length; i++, x++) {
			for(int j = 0, y = 0; j < last[0].length; j++, y++) {
				if(i==j) {
					y++;
				}
				last[i][j] = poss[x][y];
			}
		}
		
		int count = 0;
		for(int i = 0; i < sequence.length; i++) {
			if(isSequence(last[i]) == true) {
				count++;
				break;
			}
		}
		return count > 0;
	}
	
	 public static boolean isSequence(Integer[] sequence) {
		boolean[] testes = new boolean[sequence.length-1];
		for(int i = 0; i < sequence.length-1; i++) {
			if(sequence[i] < sequence[i+1]) {
				testes[i] = true;
			}else {
				testes[i] = false;
			}
		}
		int count = 0;
		for(int i = 0; i < testes.length; i ++) {
			if(testes[i]==true) {
				count++;
			}
		}
		if(count==testes.length) {
			return true;
		} else {
			return false;
		}
	}
	
}
