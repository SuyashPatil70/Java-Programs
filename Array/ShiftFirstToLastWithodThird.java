class ShiftFirstToLastWithodThird{
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,5,6,7,8,9,0};
		for(int i=0;i<a.length-1;i++)
		{
			a[i]+=a[i+1];
			a[i+1]=a[i]-a[i+1];
			a[i]-=a[i+1];
		}
		for(int i=0;i<=a.length-1;i++)
			System.out.println(a[i]);
	}
}