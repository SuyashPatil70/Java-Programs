class SuperKeyword{
	public static void main(String suy[])
	{
		Demo3 d1 = new Demo3();
		d1.display();
		Demo3 d2 = new Demo3(10);
		Demo1 d3 = new Demo3();
	}
}
class Demo1{
	int a=10;
	void display()
	{
		System.out.println("Display method of Demo1");
		System.out.println("a = "+a);
	}
	Demo1()
	{
		System.out.println("default constructor of Demo1");
	}
	Demo1(int a)
	{
		System.out.println("user defind constructor of Demo1");
	}
}
class Demo2 extends Demo1{
	int a=20;
	void display()
	{
		System.out.println("Display method of Demo2");
		System.out.println("a = "+super.a);
	}
	Demo2()
	{
		
		System.out.println("default constructor of Demo2");
	}
	Demo2(int a)
	{
		System.out.println("user defind constructor of Demo2");
	}
}
class Demo3 extends Demo2{
	int a=30;
	void display()
	{
		System.out.println("Display method of Demo3");
		System.out.println("a = "+super.a);
	}
	Demo3()
	{
		
		System.out.println("default constructor of Demo3");
	}
	Demo3(int a)
	{
                super();
		System.out.println("user defind constructor of Demo3");
	}
}