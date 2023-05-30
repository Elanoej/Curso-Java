package entitties;

import java.util.HashMap;
import java.util.Map;

public class classes {
	
	public static int solution(String s1, String s2) {
		Map<Character, Integer> letras = howMany(s1);
		Map<Character, Integer> letras2 = howMany(s2);
		Map<Character, Integer> result = mapDiff(letras, letras2);
		
		int sum = 0;
		for(Character key : result.keySet()) {
			sum += result.get(key);
		}
		return sum;
	}
	
	public static Map<Character, Integer> howMany(String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			int count = 0;
			
			for(int j = 0; j < str.length(); j++) {
				if(ch == str.charAt(j)) {
					count++;
				}
			}
			map.put(ch, count);
		}
		return map;
	}
	
	public static Map<Character , Integer> mapDiff(Map<Character, Integer> map1, Map<Character, Integer> map2){
		Map<Character , Integer> resultMap = new HashMap<>();
		
		for(Character key : map1.keySet()) {
			for(Character key2 : map2.keySet()) {
				
				if(key == key2) {
					resultMap.put(key, minimo(map1.get(key), map2.get(key2)));	
				}
			}
		}
		return resultMap;
	}
	
	public static int minimo(int a, int b) {
		if (a != b) {
			if(a>b) {
				return b;
			} else {
				return a;
			}
		}
		return a;
	}
}
	
