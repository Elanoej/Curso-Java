package entitties;


public class AddBorder {

	public static String[] solution(String[] picture) {
		String[] result = new String[picture.length+2];
		String manipuled1 = "";
		String manipuled2 = "";
		
		for(int i =0; i < picture[0].length()+2; i++) {
			manipuled1 += "*";
		}
		
		for(int i = 0 ; i < picture.length; i++) {
			result[i+1] = "*" + picture[i] + "*";
		}
		
		for(int i =0; i < picture[picture.length-1].length()+2; i++) {
			manipuled2 += "*";
		}
		
		result[0] = manipuled1;
		result[result.length-1] = manipuled2;
		
		return result;
		
	}

}
