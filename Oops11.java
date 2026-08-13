 abstract class A{
	 abstract void start();
 }
 class B extends A{
	 void start(){
		 System.out.println("Bike is started ");
	 }
 }
 class Oops11
 {
	 public static void main(String[] args)
	 {
		 B b=new B();
		 b.start();
	 }
 }
