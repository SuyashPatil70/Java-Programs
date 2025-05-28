class Main{
	public static void main(String suy[])
	{
		Laptop l = new Laptop();
		l.start();
		l.configure();
		
		Mobile m = new Mobile();
		m.start();
		m.configure();
	}
}