class GreaterAvgThanElement{
	public static void main(String suy[])
	{
		int a[]={1,22,33,44,0,55};
		double avg=0;
		for(int i=0;i<a.length-1;i++)
			avg+=a[i];
		avg/=a.length;	
		for(int i=0;i<=a.length-1;i++)
			if(a[i]>avg)
			System.out.println(a[i]);
	}
}