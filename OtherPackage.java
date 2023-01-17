package p2;
class OtherPackage 
{
	OtherPackage() 
	{
		p1.Protection p = new p1.Protection();
		System.out.println("other package constructor");
		//System.out.println("n = " + p.n);
//default accessible to same class, sub class, non sub class of same package
		//System.out.println("n_pri = " + p.n_pri);
//private accessible with the same class only
		//System.out.println("n_pro = " + p.n_pro);
//protected accessible to all classes within the same  package and other package subclass only
		System.out.println("n_pub = " + p.n_pub);
	}
}