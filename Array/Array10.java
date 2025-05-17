import java.util.Arrays;
class Array10{
	public static void main(String suy[])
	{
		int a[]={1,20,30,42,52,63,71,82,9};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				int sum=0;
				while(a[i]!=0)
				{
					sum+=a[i]%10;
					a[i]/=10;
				}
				a[i]=sum;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
}