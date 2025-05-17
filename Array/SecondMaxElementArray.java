class SecondMaxElementArray{
	public static void main(String suy[])
	{
	int a[]={1,2,3,4,5,6,4,3,5,6};
	int max=0,smax=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			smax=max;
			max=a[i];
		}
		else if(a[i]>smax&&a[i]!=max)
		smax=a[i];
	}
		System.out.println("max="+max);
		System.out.println("smax="+smax);
	}
}