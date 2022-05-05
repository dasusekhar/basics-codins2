package basicCodings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1=" abc";
		String s2="cbat";
		 boolean checkangar=isAnagram(s1,s2);
		 if(checkangar)
		 {
			 System.out.println("both are anagram");
		 }else
		 {
			 System.out.println("both are not anagram");
		 }

	}

	private static  boolean isAnagram(String s1, String s2) {
		char [] k1=s1.toCharArray();
		char[] k2=s2.toCharArray();
		Arrays.sort(k1);
		Arrays.sort(k2);
		if(Arrays.toString(k1).equals(Arrays.toString(k2)))
		{
			return true;
		}
		return false;
		
		
	}

}
