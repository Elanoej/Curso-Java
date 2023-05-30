package entitties;

public class amendTheSetence {
	
	public static String solution(String s) {
		String result = s;
		
	    for(int i =1;i<result.length();i++) {
	    	if(Character.isUpperCase(result.charAt(i))) {
	    		String before = result.substring(0, i);
	    		String after = result.substring(i, result.length());
	    		StringBuilder sb = new StringBuilder(after);
	    		sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
	    		after = sb.toString();
	    		
	    		result = before + " " + after;
	    	}
	    }
	    StringBuilder sb = new StringBuilder(result);
	    sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
	    return sb.toString();  
	}
}
