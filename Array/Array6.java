class Array6{
//WAP to find avg of Odd And Even 
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		double avgOdd=0,avgEven=0;int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				avgEven+=a[i];
				count++;
			}
			else
			{
				avgOdd+=a[i];
			}
		}
		System.out.println("Average of Even Element = "+avgEven/count+" Average of Odd Elements = "+avgOdd/(a.length-count));
	}
}