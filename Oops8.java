class A{
	 void sound();
	{
		System.out.println("A makes sound ");
	}
}
class B extends A{
	 void sound();
	{
		System.out.println("Dog barks");
	}
}
class Oops8{
	public static void main(String[] args){
		A a=new B();
         a.sound;
	}
}