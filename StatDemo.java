class A{
   int i;
   static int j;
   A(){
       i++;
       j++;
   }
   void display(){
  System.out.println("Value of I = "+i+" And Value of J ="+j);
  }
}
class StatDemo{

public static void main(String args[]){

 A obj = new A();
obj.display();
 A obj1 = new A();
obj1.display();
 A obj2 = new A();
obj2.display();


}



}