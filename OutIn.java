class Outer //Outer class
{
	int i=10;
	private int k=30;
	
	void displayOuter()
	{
		System.out.println ("Outer i = "+i);
		System.out.println ("in display() of Outer class");
	//	System.out.println ("Inner  j ="+j);//C.E cannot access 
		//inner member in Outer class
	//	displayInner();//C.E cannot access inner member in Outer class
		Inner  in=new Inner();
		System.out.println ("Inner j = "+in.j);
		in.displayInner();
	}
	
	class Inner //nested class or inner class
	{
		int j=20;
		
		void displayInner()
		{
			System.out.println ("Outer private k= "+k);
			//can access private variable of Outer class
			System.out.println ("Outer i = "+i);
			//can access  valriable of Outer class
			displayOuter();
			//can access method of Outer class
			System.out.println ("Inner j =  "+j);
			System.out.println ("in display() of Inner class");
		}
	}
}

class OutIn
{
	public static void main(String args[])
	{
		Outer out=new Outer();
		System.out.println (out.i);
		out.displayOuter();
		
		Outer.Inner in=new Outer().new Inner();
		System.out.println (in.j);
		in.displayInner();
		
		System.out.println ("---------------");
		
		Outer.Inner in1=out.new Inner();
		System.out.println (in1.j);
		in1.displayInner();
	}
}