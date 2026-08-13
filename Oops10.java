class A
{
	int x=10;
}
class B extends A{
	int y=20;
	void display()
	{
		System.out.println("sum="+(x+y));
	}
}
class C extends A{
	int z=30;
	void display(){
		System.out.println("sum="+(x+y+z));
	}
}
class Oops10
{
	public static void main(String[] args)
	{
		B b=new B();
		C c=new ();
		b.display();
		c.display();
	}
}
	
	