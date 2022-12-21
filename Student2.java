class StudentDemo
{
	int rollno;
	String name;
	double percent;

void setValue(int r, String n, double p)
{
	rollno=r;
	name=n;
	percent=p;
}	
void display()
{
	System.out.println(rollno+"\t"+name+"\t"+percent);
}
}

class Student2
{
	public static void main(String args[])
	{
		StudentDemo obj1 = new StudentDemo();
		obj1.display();

		System.out.println("--------------------------");
	
		obj1.setValue(101,"Uzair",85.64);
		obj1.display();

		StudentDemo obj2 = new StudentDemo();
		obj2.setValue(102,"Yashraj",95.87);
		obj2.display();
	}
}
	
		