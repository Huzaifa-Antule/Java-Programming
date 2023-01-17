package p1;
class Demo
{
	public static void main(String args[])
	{
		Protection p=new Protection();
		System.out.println("------------------");
		Derived d=new Derived();
		System.out.println("------------------");
		SamePackage sp=new SamePackage();
	}
}