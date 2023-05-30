package entitties;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNotRepeatingCharacter {
	
	public static char solution(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
				continue;
			}
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		for(Character key : map.keySet()) {
			if(map.get(key)==1) {
				return key;
			}
		}
		return '_';
	}
}
