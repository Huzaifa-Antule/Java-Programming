abstract class Abs{
	abstract void m1();
	void m2(){
	 System.out.println("In m2() method of Abs ");
	}
	//abstract static void m1();
	 //illegal combination of modifiers: abstract and static
	//abstract final void m1();
	 //illegal combination of modifiers: abstract and final
	//abstract private void m1();
	//illegal combination of modifiers: abstract and private

}
class Abs1 extends Abs{
	void m1(){
		System.out.println("In m1() method of Abs ");
	}
}

class AbsDemo{
  public static void main(String args[]){
     
	 Abs1 obj = new Abs1();
	 obj.m1();
	 obj.m2();
  
  
  
  
  
  }

}