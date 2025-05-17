import java.util.Arrays;
class SumOfElementAtFirst{
	public static void main(String suy[])
	{
		int a[]={121,32,123123,3211};
		for(int i=0;i<=a.length-1;i++)
		{
			int temp=a[i];
			int sum=0;
			int count=0;
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
				count++;
			}
			sum*=Math.pow(10,count);
			a[i]+=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}