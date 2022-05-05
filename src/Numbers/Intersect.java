package Numbers;

import java.util.HashSet;
import java.util.Set;

public class Intersect {
	public static void main(String [] args)
	{
		int array1[]= {12,34,56,67};
		int array2[]= {23,34,54,65};
		/*
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println("dupliate elements are   :"+array2[j]);
				}
			}
		}
		*/
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<array1.length;i++)
		{
			set.add(array1[i]);
		}
		for(int j=0;j<array2.length;j++)
		{
			if(set.contains(array2[j]))
			{
				System.out.println("the duplicates values are :"+array2[j]);
			}
		}
		
		
	}

}
