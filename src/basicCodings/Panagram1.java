package basicCodings;

public class Panagram1 {
public static void main(String [] args)
{
  String s="hai this is dasu sekhar";
  System.out.println(isPangram(s));
	
}

private static boolean  isPangram(String s) {
	
	if(s.length()<26)
	{
		return false;
	}else
	{
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch)<0)
			{
				return false;
			}
		}
	}
	return true;
	
}
}
