package Numbers;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
	  int array[]= {12,34,35,56,45,89};
	  /*
	  for(int i=0;i<array.length;i++)
	  {
		  for(int j=i+1;j<array.length;j++)
		  {
			  if(array[i]>array[j])
			  {
				  int temp=array[i];
				  array[i]=array[j];
				  array[j]=temp;
			  }
		  }
	  }
	 // System.out.println(array[array.length-5]);
	  
	  System.out.println(array[1]);
	  */
	  /*
	  int temp = 0;
	  for(int i=0;i<array.length;i++)
	  {
		  for(int j=i+1;j<array.length;j++)
		  {
			  if(array[i]<array[j])
			  {
				   temp=array[i];
				  array[i]=array[j];
				  array[j]=temp;
			  }
		  }
	  }
	  for( int i=0;i<array.length;i++)
	  {
		  System.out.println(array[i]);
	  }
	 
	  */
	  List<Integer> lists=Arrays.asList(12,45,23,56,89,67,54,34,59);
	  for(int i=0;i<lists.size();i++)
	  {
		  for( int j=i+1;j<lists.size();j++)
		  {
		    if(i>j)
		    {
		    	int temp=i;
		    	i=j;
		    	j=temp;
		    	System.out.println(lists);
		    }
			  
		  }
		  //System.out.println(lists);
	  }
	  
	}
}
	  
	  

	


