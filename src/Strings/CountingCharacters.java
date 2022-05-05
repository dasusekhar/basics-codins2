package Strings;

import java.util.HashMap;

public class CountingCharacters {

	public static void main(String[] args) {
	      String str="my name is dasu sekhar";
	      HashMap<Character,Integer>map=new HashMap<>();
	      for(int i=0;i<str.length();i++)
	      {
	    	  char ch=str.charAt(i);
	    	  if(map.get(ch)==null)
	    	  {
	    		  map.put(ch, 1);
	    	  }else
	    	  {
	    		  map.put(ch, map.get(ch)+1);
	    	  }
	      }
	      System.out.println(map);
	      

	}

}
