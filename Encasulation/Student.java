class Student{
	private int id;
	private String name;
	private String city;
	private double percentage;

	//setter
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setPercentage(double percentage)
	{
		this.percentage=percentage;
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
	public String getCity()
	{
		return city;
	}
	public double getPercentage()
	{
		return percentage;
	}
}