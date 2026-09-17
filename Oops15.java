class A{
	private int x;
	private int y;
	void setxvalue(int x){
		this.x=x;
	}
	void setyvalue(int y){
		this.y=y;
	}
	int getxvalue()
	{
	return x;}
	int getyvalue()
	{
		return y;
	}
}
	class Oops15{
		public static void main(String[] args){
			B b=new B();
			b.setxvalue(10);
			b.setyvalue(20);
			 int i=b.getxvalue();
			int j=b.getyvalue();
			System.out.println(i+j);
		}
	}
