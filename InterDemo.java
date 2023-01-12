interface ShapeD
{
	double PI=3.14;
	void area();
}	

class Circle implements ShapeD
{
	double r;
	
	Circle(double r)
	{
		this.r=r;
	}
	
	public void area()
	{
		System.out.println ("Area of Circle "+(PI*r*r));
	}
	
}

class Square implements ShapeD
{
	double s;
	
	Square(double s)
	{
		this.s=s;
	}
	
	public void area()
	{
		System.out.println ("Area of Square "+(s*s));
	}	
}

class Rect implements ShapeD
{
	double l,b;
	
	Rect(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	
	public void area()
	{
		System.out.println ("Area of Rectangle "+(2*l*b));
	}	
}

class InterDemo
{
	public static void main(String args[])
	{
		ShapeD s;
		
		s=new Circle(2);
		s.area();
		
		System.out.println ("-----------");
		
		s=new Square(3);
		s.area();
		
		System.out.println ("-----------");
			
		s=new Rect(2,3);
		s.area();
		
	}
}