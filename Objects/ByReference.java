class ByReference{
	public static void main(String suy[]){
		Obj1 o1 = new Obj1();
		Obj1 o2 = o1;
		o1.display();
		o2.display();
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));	
	}
}