import java.util.*;
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
				
				int c=a/b;
				System.out.println("Result = "+c);
			}
			catch(Throwable e)
			{
				System.out.println(e.getMessage());
				System.out.println (e);
				e.printStackTrace();
			}
			finally
			{
				System.out.println ("in finally block");
			}
			System.out.println("End of Main");
	}
}