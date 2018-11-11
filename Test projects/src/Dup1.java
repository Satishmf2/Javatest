import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Java program to remove the duplicates from the input string.

public class Dup1{
	public static void main(String args[]) {
//		String st1="zzbbccaaaaaxxxxyy";
//		char ch1[]=st1.toCharArray();
//		Arrays.sort(ch1);
//		
//	    Set<Character> s1=new LinkedHashSet<Character>();
//	    
//	    for(Character c:ch1) {
//            s1.add(c);
//	  	
//	}
//	    StringBuffer sb=new StringBuffer();
//	    
//	    for(Character c1:s1) {
//	    	     sb.append(c1);
//	    }
//	    System.out.println("Ascending Order Char: " +s1.toString());
//	    System.out.println("Ascending Order Strn: " +sb);
//	    System.out.println("Descendin Order Strn: " +sb.reverse());
	    
		Solution s=new Solution();
	    s.longestPalindrome("madam");
}}


class ee{
	public static void main(String args[]) {
		String str="mam";
		char a[]=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(Character c:a) {
			sb.append(c);
		}
		System.out.println(": " +sb.reverse());
	    System.out.println(" : " +sb);
		
		
		
	}
}


class Solution {
	  public String longestPalindrome(String s) {
	    if (s == null || s.length() < 2) {
	      return s;
	    }

	    int length = s.length();

	    boolean[][] isPalindrome = new boolean[length][length];

	    int left = 0;
	    int right = 0;

	    for (int j = 1; j < length; j++) {
	      for (int i = 0; i < j; i++) {
	        boolean isInnerWordPalindrome = isPalindrome[i + 1][j - 1] || j - i <= 2;

	        if (s.charAt(i) == s.charAt(j) && isInnerWordPalindrome) {
	          isPalindrome[i][j] = true;

	          if (j - i > right - left) {
	            left = i;
	            right = j;
	          }
	        }
	      }
	    }

	    System.out.println(" "+s.substring(left, right + 1));
	    return s.substring(left, right + 1);

	    // Time Complexity: O(n ^ 2)
	    // Space Complexity: O(n ^ 2)
	  }
	}