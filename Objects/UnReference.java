class UnReference{
	public static void main(String suy[])
	{
		Obj1 o1 = new Obj1();
		o1.a=10;
		o1.b=20;
		o1.display();
		new Obj1().a=100;
		new Obj1().b=200;
		new Obj1().display();
	}
}