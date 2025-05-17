class SwapFirstToLast{
	public static void main(String suy[])
	{
	int a[]={1,2,3,4,5,56,67,88,0};
	int temp=a[0];
	a[0]=a[a.length-1];
	a[a.length-1]=temp;
	for(int i=0;i<=a.length-1;i++)
	System.out.println(a[i]);
	}
}
