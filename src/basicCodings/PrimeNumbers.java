package basicCodings;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n=5,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("prime number "+n);
		}else
		{
			System.out.println("this is not a prime number "+n);
		}

	}

}
