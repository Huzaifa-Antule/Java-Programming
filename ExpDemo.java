import java.util.*;

class CannotDivideBySevenException extends Exception
{
	CannotDivideBySevenException(String msg)
	{
		System.out.println (msg);
	}
}
class ExpDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Value a");
			int a=sc.nextInt();
			System.out.println("Enter Value b");
			int b=sc.nextInt();
			
			if(b==7)
			{
				throw new CannotDivideBySevenException("cannot divide by Seven");
			}				
			int c=a/b;
			System.out.println ("Result = "+c)	;
		}
		catch(CannotDivideBySevenException cdbse)
		{
			System.out.println (cdbse);
		}
			
		System.out.println("End of Main");
	}
}