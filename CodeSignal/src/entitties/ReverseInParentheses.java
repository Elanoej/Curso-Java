package entitties;

public class ReverseInParentheses {
	
	public static String solution(String iStr) {
		int firstInd = iStr.lastIndexOf("(");
		int lastInd = iStr.indexOf(")", firstInd);
		while(firstInd != -1) {
			String revStr = new StringBuilder(iStr.substring(firstInd+1, lastInd)).reverse().toString();
			String first = iStr.substring(0, firstInd);
			String last = iStr.substring(lastInd+1);
			iStr = first+revStr+last;
			firstInd = iStr.lastIndexOf("(");
			lastInd = iStr.indexOf(")", firstInd);
		}
		return iStr;
	}

}
