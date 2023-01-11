interface Inter1
{
	void m1();
}
interface Inter2 
{
	void m2();
}
interface Inter3 extends Inter1,Inter2
{
	void m3();
}
class A  implements Inter3
{
	public void m1()
	{
		System.out.println ("in m1() implements in A class");
	}

	public void m2()
	{
		System.out.println ("in m2() implements in A class");
	}	

	public void m3()
	{
		System.out.println ("in m3() implements in A class");
	}
}	

class InterDemo
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}