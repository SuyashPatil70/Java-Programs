import java.util.Arrays;
class SumOfElementAtLast{
	public static void main(String suy[])
	{
		int a[]={121,434,433,2312,5435};
		for(int i=0;i<=a.length-1;i++)
		{
			int temp=a[i];
			int sum=0;
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}
		   	if(sum<10)
				a[i]*=10;
			else
				a[i]*=100;
			
		    a[i]+=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}
//output :[1214, 43411, 43310, 23128, 543517]