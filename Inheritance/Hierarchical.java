class Hierarchical{
	public static void main(String suy[])
	{
		Square s = new Square();
		s.show();
		s.showSquare();
		Rectangle r = new Rectangle();
		r.show();
		r.display();
				
	}
}
class Shape{
	void show()
	{
		System.out.println("in a shape class");
	}
}
class Rectangle extends Shape{
	void display()
	{
		System.out.println("Rectangle calling");
	}
}
class Square extends Shape{
	void showSquare()
	{
		System.out.println("square calling");
	}
}