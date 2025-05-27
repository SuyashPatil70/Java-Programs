class Employee{
	private int id;
	private String name;
	private String stream;
	private double salary;
	//setter

	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setStream(String stream)
	{
		this.stream=stream;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;	
	}
	
	//getter
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name; 
	}
	public String getStream()
	{
		return stream;
	}
	public double getSalary()
	{
		return salary;
	}

	//constructor
	Employee(int id,String name,String stream,double salary)
	{
		this.id=id;
		this.name=name;
		this.stream=stream;
		this.salary=salary;	
	}
	
	//overrride toString method
	
	public String toString()
	{
		return "Employee[ID: " + id + ", NAME: " + name + ", STREAM: " + stream + ", SALARY: " + salary + "]";
	}
}