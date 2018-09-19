//Source: EPI Chapter 6 Question 6 and LeetCode
//Problem: String reversing problems
//Assumption:

public class ReverseWordsString {
	
	// Classic reverse a String
	// T(N) S(N)
	//---------------------------------------
	public String reverseString(String s) {
        char[] string = s.toCharArray();
        
        int n = 0, m = string.length-1;
        char tmp;
        while(n<m){
            tmp = string[n];
            string[n] = string[m];
            string[m] = tmp;
            n++;
            m--;
        }
        return new String(string);
    }
	
	
	// Reverse words in a String but keep Order e.g "hello   I am" = "am I hello"
	// T(N) S(N)
	//-----------------------------------------
	public String reverseWords(String s) {
	    // edge case check
	    if (s == null) return null;
	    
	    char[] a = s.toCharArray();
	    int n = a.length;
	    
	    // step 1. reverse the whole string
	    reverse(a, 0, n - 1);
	      
	    // step 2. reverse each word
	    reverseWords(a, n);
	      
	    // step 3. clean up spaces
	    return cleanSpaces(a, n);
	  }
	  
	  void reverseWords(char[] a, int n) {
	    int i = 0, j = 0;
	      
	    while (i < n) {
	      while (i < j || (i < n && a[i] == ' ')) i++; // skip spaces
	      while (j < i || (j < n && a[j] != ' ')) j++; // skip non spaces
	      reverse(a, i, j - 1);                      // reverse the word
	    }
	  }
	  
	  // trim leading, trailing and multiple spaces
	  String cleanSpaces(char[] a, int n) {
	    int i = 0, j = 0;
	      
	    while (j < n) {
	      while (j < n && a[j] == ' ') j++;             // skip spaces
	      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
	      while (j < n && a[j] == ' ') j++;             // skip spaces
	      if (j < n) a[i++] = ' ';                      // keep only one space
	    }
	  
	    return new String(a).substring(0, i);
	  }
	  
	  // reverse a[] from a[i] to a[j]
	  private void reverse(char[] a, int i, int j) {
	    while (i < j) {
	      char t = a[i];
	      a[i++] = a[j];
	      a[j--] = t;
	    }
	  }
	  
	  //-----------------------------------
	  // Problem: Reverse order of each string while preserving structure e.g "Hello I am" = "olleH I ma"
	  // assumption: In the string, each word is separated by single space and there will not be any extra space in the string.
	  // T(N) S(N)
	  public String reverseWords2(String s) {
	        String[] strs = s.split(" ");
	        StringBuilder sb = new StringBuilder();
	        for(String str: strs){
	            StringBuilder temp = new StringBuilder(str);
	            sb.append(temp.reverse());
	            sb.append(" ");
	    }
	    return sb.toString();
	}
	  
	  
}
