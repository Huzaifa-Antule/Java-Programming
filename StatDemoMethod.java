class A{
   int i;
   static int j;
   A(){
       i++;
       j++;
   }
  static void m1(){
  System.out.println("In m1 static method ");
  }
 static void m2(){
  System.out.println("In m2 static method ");
  }
   void display(){
  System.out.println("Value of I = "+i+" And Value of J ="+j);
  }
}
class StatDemoMethod{

public static void main(String args[]){

 A obj = new A();

obj.display();
obj.m2();
obj.m1();
}

}