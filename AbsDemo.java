abstract class Abs//abstract class
{
	 abstract static void m1();
	 //illegal combination of modifiers: abstract and static
	 abstract final void m1();
	 //illegal combination of modifiers: abstract and final
	 abstract private void m1();
	//illegal combination of modifiers: abstract and private
}
