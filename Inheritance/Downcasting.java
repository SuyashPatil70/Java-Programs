class Downcasting
{
	public static void main(String suy[])
	{
		Parent p= new Child();
		p.name="Suyash";
		Child c= (Child)p;
		c.id=10;
		System.out.println(c.id);
		System.out.println(c.name);
		c.method();
		Child c1= new Parent();
		c1.name="Suyash";
		
	}
}
class Parent
{
	String name;
	void method()
	{
		System.out.println("Method from Parent");
	}
}
class Child extends Parent
{
	int id;
	void method()
	{
		System.out.println("Methos from Child");
	}
}