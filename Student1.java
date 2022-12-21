class StudentDemo
{
	int rollno;
	String name;
	double percent;
	
void display()
{
	System.out.println(rollno+"\t"+name+"\t"+percent);
}

}
class Student1
{
	public static void main(String args[])
	{
		StudentDemo obj1 = new StudentDemo();
		System.out.println(obj1.rollno);
		System.out.println(obj1.name);
		System.out.println(obj1.percent);
		obj1.display();	
				


StudentDemo obj2 = new StudentDemo();

	obj2.rollno=11;
	obj2.name="Uzair";
	obj2.percent=91.50;
	obj2.display();

StudentDemo obj3 = new StudentDemo();

	obj3.rollno=12;
	obj3.name="Yashraj";
	obj3.percent=85.64;
	obj3.display();
}
}																																																																																	