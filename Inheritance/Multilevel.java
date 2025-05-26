class Multilevel{
	public static void main(String suy[])
	{
		C obj = new C();
		obj.m1();
		obj.m2();
		obj.m3();
	} 
}
class A{
	void m1()
	{
		System.out.println("m1 method called");
	}
}
class B extends A{
	void m2()
	{
		System.out.println("m2 method called");
	}
}
class C extends B{
	void m3()
	{
		System.out.println("m3 method called");
	}	
}
class D extends C{
	void m4()
	{
		System.out.println("");
	}
}