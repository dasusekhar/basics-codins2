package basicCodings;

public class Fibonacci {

	public static void main(String[] args) {
	    int k=0,a=0,b=1;
	    while(k<15)
	    {
	    	k=a+b;
	    	a=b;
	    	b=k;
	    	System.out.println(k);
	    }

	}

}
