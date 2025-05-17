class SumOfElementIsMatchArray{
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,5,6,7,8,9,1,2,1,3};
		int key=17;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
				if(a[i]+a[j]==key)
					System.out.println(a[i]+" "+a[j]);
		}
	}
}