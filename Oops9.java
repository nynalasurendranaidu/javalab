class A{
A()
{
	System.out.println("Inside A class constructor ");
}
static int i=m2();
int j=m1();
static{
	System.out.println("A class static block");
}
int m1(){

	
	System.out.println("Inside A class instance method ");
	return 20;
}
static int m2()
{
	System.out.println("Inside A class static method ");
	return 10;
}
{
	System.out.println("Inside A class Instance block");
}
}
class B extends A{
	B()
	{
	System.out.println("Inside B class constructor");
	}
	int l=m3();
	int m3(){
		System.out.println("Inside B class Instance method ");
	return 30;
	}
	static int m4()
	{
		System.out.println("Inside B class static method ");
		return 40;
	}
	static int k=m4();
	{
		System.out.println("Inside B class instance block ");
	}
	static {
		System.out.println("Inside B class static block ");
	}
}
	class Oops9 {
	
		public static void main(String[] args)
		{
			B b=new B();
			System.out.println(b.m1());
		}
	}


