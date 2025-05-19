class Obj1{
	int a,b;
	void display()
	{
		System.out.println("a = "+a+" b = "+b);
	}
	boolean equals(Obj1 o1)
	{
		if(a==o1.a)
			if(b==o1.b)
				return true;
		return false;
	}
}