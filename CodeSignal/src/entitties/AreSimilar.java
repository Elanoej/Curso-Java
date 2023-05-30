package entitties;

public class AreSimilar {
	
	public boolean solution(int[] a , int[] b) {
		
	}
	
	public void swap(int[]vet ,int a, int b) {
		int posA = 0;
		int valueA = 0;
		int posB = 0;
		int valueB = 0;
		for(int i = 0; i < vet.length; i++) {
			if(vet[i]==a) {
				posA = i;
				valueA = vet[i];
			}
			if(vet[i] == b) {
				posB = i;
				valueB = vet[i];
			}
		}
		//done
		vet[posA] = valueB;
		vet[posB] = valueA;
	}
	
}
