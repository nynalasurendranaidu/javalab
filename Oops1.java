class A{
	int i;
	int j;
	A(int k,int l);
	{
	        i = k;
		    j = l;
	}
	int m1(){
		return i;
	}
	int m2(){
		return j;
	}
}
class Oops1{
	public static void main(String[] args){
		A a1=new A(10,20);
		A a2=new A(30,40);
		A a3=new A(50,60);
		System.out.println(a1.m1());
		System.out.println(a2.i);
		System.out.println(a3.m2());
	
		
		
	}
}
		
	    
	