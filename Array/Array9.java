class Array9{
//WAP to repalce odd elements to first digit of element.
	public static void main(String suy[])
	{
		int a[]={1,212,36,44,58,60,77,88,97};
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]%2==0)
				{
					int temp=a[i];
					int sum=0;
					while(temp!=0)
					{
						temp%=10;
						sum=sum+temp;
						temp/=10;
					}
					a[i]=sum;
				}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}