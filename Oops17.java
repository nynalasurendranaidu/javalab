interface I1{
	void m1();
	void m2();
}
interface I2{
	void m3();
	void m4();
}
class A{
	void m5(){
		System.out.println("hI");
	}
}
class B extends A implements I1,I2{
	public void m4(){
		System.out.println("hi");
	}
	public void m3(){
		System.out.println("hi");
	}
	public void m2(){
		System.out.println("hi");
	}
	public void m1(){
		System.out.println("hi");
	}
}
class Oops17{
	public static void main(String [] args){
		B b =new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}
}
		
	