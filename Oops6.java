class A {
	A(int i)
	{
		super();
		System.out.println("Hello");
		System.out.println(i);
	}
}
class B extends A{
	B()
	{
		super(10);
		System.out.println("Hi");
	}
	
}
class Oops6{
	public static void main(String[] args)
	{
		B b = new B();
	}
}

