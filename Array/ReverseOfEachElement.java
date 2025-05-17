import java.util.Arrays;
class ReverseOfEachElement{
	public static void main(String suy[])
	{
		int a[]={123,321,43,34,32,56};
		for(int i=0;i<=a.length-1;i++)
		{
			int sum=0;
			while(a[i]!=0)
			{
				sum*=10;
				sum+=a[i]%10;
				a[i]/=10;
			}
			a[i]+=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}