class Const
{

Const()
{
System.out.println("In Default Constructor");
}
Const(int i)
{
System.out.println("In Default Constructor"+i);
}
void Const()
{
System.out.println("In Mthod Const");
}
}
class ConstDemo
{
public static void main(String args[]){
Const obj1 = new Const();
Const obj2 = new Const(10);
obj2.Const();
}
}
