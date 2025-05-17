class Array5{
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,5};
		double avg = 0,count=0;
		for(int i=0;i<=a.length-1;i++)
		{
            if(a[i] % 2!=0)
			{
				avg += a[i];
				count++;
			}
		}
			avg /= count;
		
		System.out.println("Odd Element Avg = "+avg);
	}
}