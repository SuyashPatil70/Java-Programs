class Upcasting
{
	public static void main(String suy[])
	{
		GrandParent g = new Child();
		g.m1();
		g.m2();
		g.m3(); 
		GrandParent g1 = new Parent();
		
	}
}
class GrandParent
{
	void m1()
	{
		System.out.println("m1 method called in class GrandParent");
	}
	void m2()
	{
		System.out.println("m2 method called in class GrandParent");
	}
	void m3()
	{
		System.out.println("m3 method called in class GrandParent");
	}
}
class Parent extends GrandParent
{
	/*void m1()
	{
		System.out.println("m1 method called in class Parent");
	}
	void m2()
	{
		System.out.println("m2 method called in class Parent");
	}
	void m3()
	{
		System.out.println("m3 method called in class Parent");
	}*/
	void m4()
	{
		System.out.println("m4 method called in class Parent");
	}
	void m5()
	{
		System.out.println("m5 method called in class Parent");
	}
	void m6()
	{
		System.out.println("m6 method called in class Parent");
	}
}
class Child extends Parent
{
/*	void m1()
	{
		System.out.println("m1 method called in class Child");
	}
	void m2()
	{
		System.out.println("m2 method called in class Child");
	}
	void m3()
	{
		System.out.println("m3 method called in class Child");
	}
	void m4()
	{
		System.out.println("m4 method called in class Child");
	}*/
	void m5()
	{
		System.out.println("m5 method called in class Child");
	}
	void m6()
	{
		System.out.println("m6 method called in class Child");
	}
	void m7()
	{
		System.out.println("m7 method called in class Child");
	}
	void m8()
	{
		System.out.println("m8 method called in class Child");
	}
	void m9()
	{
		System.out.println("m9 method called in class Child");
	}
}