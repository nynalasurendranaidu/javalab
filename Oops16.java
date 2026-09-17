class A{
	void m1(){
		System.out.println("Hi");
	}
	class B extends A{
		final void m1(){
			System.out.println("Hello");
		}
	}
}
	class Oops16{
		public static void main(String[] args){
			B b =new B();
			b.m1();
		}
	}
	