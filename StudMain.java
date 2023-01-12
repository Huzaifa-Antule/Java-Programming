//import stud1.Stud;----single class will be imported
//import stud1.*;---all classes of the package will be available

class StudMain
{
	public static void main(String args[])
	{
		//Stud s=new Stud(1,"Abc");--using import
		stud1.Stud s=new stud1.Stud(2,"PQR");
		//using fully qualified classname
		s.display();
	}
}