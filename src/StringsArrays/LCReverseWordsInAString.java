import java.util.Arrays;

public class LCReverseWordsInAString {
	public static void main(String[] args) {
		String s = "The sky is blue";
		System.out.println(Arrays.toString(reverseWords(s)));
	}
	
	public static char[] reverseWords(String s) {
	    if (s == null) return null;

		char[] a = s.toCharArray();
		for(int i = 0; i < a.length; i++) {
		
		if(a[i] != ' ') {
			int j = i;
			while(a[j] != ' ' && j < a.length-1) {
				j++;
			}
			reverse(a,i,j);
		}
		}
		return a;
	}
	
	public static char[] reverse(char[] a, int i, int j) {
		while (i < j) {
		      char t = a[i];
		      a[i++] = a[j];
		      a[j--] = t;
		    }
		return a;
	}
}

