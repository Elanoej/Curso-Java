package entitties;

import java.util.HashSet;

public class firstDuplicate {
	
	//idéia do stackoverflow
	public static int solution(int[] a) {
		HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<a.length;i++){
            if (! hashSet.contains(a[i])) {
                hashSet.add(a[i]);
            } else {
                return a[i];
            }
        }
        return -1;
}
	
}
