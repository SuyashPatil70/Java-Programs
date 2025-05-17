class Array7{
//WAP to repalce odd elements to first digit of element
	public static void main(String suy[])
	{
		int a[]={1,2111,31111,4761,35111,6611,71,81,91};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
				{
					int temp=a[i];
					
					while(temp>10)
						
						temp/=10;
					
					a[i]=temp;
				}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}