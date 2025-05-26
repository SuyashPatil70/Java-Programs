class Calling{
	public static void main(String suy[])
	{
		C c1= new C();
		c1.m1();
		//c1.m2();
	}
}
interface A{
	void m1();
	
}
interface B{
	void m1();
	
}
class C implements A,B{
	public void m1()
	{
		System.out.println("m1 methods calling");	
	}
	
} 