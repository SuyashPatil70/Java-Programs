class ByMethod{
	public static void main(String suy[])
	{
		System.out.println("program started");
		try{
			Class c = Class.forName("Obj1");
			Obj1 o1 =(Obj1)c.newInstance();
		}
		catch(ClassNotFoundException | InstationException | IllegalAccessException e)
		{
			System.out.println(e);
		}
		System.out.println("Program ended");
	}
}