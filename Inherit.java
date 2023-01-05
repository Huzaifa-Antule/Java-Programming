class A
{
	A()
	{
		System.out.println ("in A class constructor");
	}
}

class B extends A
{
	B()
	{
		System.out.println ("in B class constructor");
	}
	
}

class C extends B
{
	C()
	{
		System.out.println ("in C class constructor");
	}
}

class Inherit
{
	public static void main(String args[])
	{	
		C obj=new C();
	}
}