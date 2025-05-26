class A{
	void printA()
	{
		System.out.println("A is called");
	}
}
class B extends A{
	void printB()
	{
		System.out.println("B is Called");
	}
}
class Single{
	public static void main(String suy[])
	{
		B obj = new B();
		obj.printA();
		obj.printB();
	}
}