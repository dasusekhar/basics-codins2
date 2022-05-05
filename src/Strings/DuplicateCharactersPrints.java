package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateCharactersPrints {

	public static void main(String[] args) {
		String str="welcome to java ";
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.get(ch)==null)
			{
				map.put(ch,1);
			}else
			{
				map.put(ch, map.get(ch)+1);
			}
	
		}
		Iterator<Character> tempstring=map.keySet().iterator();
		while(tempstring.hasNext())
		{
			Character temps=tempstring.next();
			if(map.get(temps)>1)
			{
				System.out.println("the character of "+temps+" appeared in  "+map.get(temps)+"  times");
			}
			
		}
		
		
		

	}

}
