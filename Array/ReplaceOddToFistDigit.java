class ReplaceOddToFistDigit{
	public static void main(String suy[])
	{
		int a[]={11,23,31,42,33,21};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
				while(a[i]>9)
					a[i]/=10;
			System.out.println(a[i]);
		}
	}
}