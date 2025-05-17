class FixArray{
	public static void main(String suy[])
	{
		int a[]={16,3,9,2,0};
		double avg=0;
		for(int i=0;i<a.length;i++)
			avg+=a[i];
		avg/=a.length;
		int shift=0;
		if(avg%1==0)
		{
			for(int i=0;i<a.length;i++)
				if(a[i]<avg)
					shift+=avg-a[i];
		}
		else

			shift=-1;
		System.out.println(shift);
	}
}