class Array8{
//WAP to repalce even elements to sum of digit of element.
	public static void main(String suy[])
	{
		int a[]={1,21,33,444,55,61,78,87,98};
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(a[i] % 2==0)
				{
					int temp=a[i];
					int sum=0;
				
				while(temp!=0)
					{
						sum+=temp%10;
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