package basicCodings;

public class Palindore {

	public static void main(String[] args) {
		 int n=120,r,sum=0;
		 int temp=n;
		 while(n>0)
		 {
			 r=n%10;
			 n=n/10;
			 sum=sum*10+r;  // this is contracting point .........................................
		 }
		 if(temp==sum)
		 {
			 System.out.println("this number is palinerome "+sum);
		 }else
		 {
			 System.out.println("this number not a palindrome "+sum);
		 }

	}

}
