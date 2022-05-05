package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesElements {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,30,60,10};
		/*
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("the duplicate elements are   :"+array[i]);
				}
			}
		}
		*/
		Set<Integer>sets=new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			if(sets.contains(array[i]))
			{
				//System.out.println("the duplicates elements are  :"+array[i]);
			}else
			{
			   sets.add(array[i]);
			   
			}
			//System.out.println(array[i]);
		}
//System.out.println(sets);

List<Integer> list=Arrays.asList(12,35,46,46,64,74);
List<Integer> list1=new ArrayList<>();
Set<Integer> set1=new HashSet<>();


list1.addAll(list);
//System.out.println(list1);
set1.addAll(list);
System.out.println(set1);
		
		
		
		 

	}

}
