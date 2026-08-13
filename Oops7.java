class B
{
	int i,j,k;
	B(int i)
	{
		this(10,20);
		System.out.println(i);
	}
	B(int i,int j){
		System.out.println(i+j);
	}
	B(int i,int j, int k)
	{
		this(10);
		System.out.println(i+j+k);
	}
}
	class Oops7
	{
		public static void main(String[] args)
		{
			B b =new B(10,20,30);
		}
	}
