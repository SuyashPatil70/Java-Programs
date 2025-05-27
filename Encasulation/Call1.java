class Call1{
	public static void main(String suy[])
	{
		Student s1= new Student();
		s1.setId(10);
		s1.setName("Suyash");
		s1.setCity("karad");
		s1.setPercentage(90.90);
		System.out.println("ID: "+s1.getId());
		System.out.println("NAME: "+s1.getName());
		System.out.println("CITY: "+s1.getCity());
		System.out.println("PERCENTAGE: "+s1.getPercentage());
		System.out.println();
		Employee e1= new Employee(121,"abhi","sde",50000);
		System.out.println(e1);
		System.out.println();

		Bank b = new Bank().setAccountNo(75678)
				   .setBankName("SBI")
				   .setIFSC_Code("SBI4332")
				   .setBranch("Pune");
		System.out.println(b);
	}
}