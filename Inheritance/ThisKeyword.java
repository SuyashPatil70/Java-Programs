class ThisKeyword{
	public static void main(String suy[])
	{
		Demo1 d1 = new Demo1(100);
		Demo d2 = new Demo(this);
		d1.display();
	}
}
class Demo1{
	int a=10;
	Demo1()
	{
		//this(10000);
		a=20;
		System.out.println("default constructor of Demo1");
		
	}
	Demo1(int a)
	{
		this();
		this.a=a;
		System.out.println("User defined constructor of Demo1");
	}
	void display()
	{
		System.out.println("a = "+a);
		System.out.println("a = "+this.a);
	}
}
 