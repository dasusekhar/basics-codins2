package basicCodings;

public class Pairs {

	public static void main(String[] args) {
		int array[]= {6,3,7,2,4,5};
		int sum=9;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;i<array.length;j++)
			{
				if(array[i]+array[j]==sum)
				{
					System.out.println(" ("+array[i]+" ,"+array[j]+" )");
					
				}
			}
		}

	}

}
