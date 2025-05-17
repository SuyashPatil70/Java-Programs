import java.util.Arrays;
class ShiftFirstToLast{
	public static void main(String suy[])
	{
		int a[]={21,435,32432,565,678};
		for(int i=0;i<=a.length-1;i++)
		{
			int temp=a[i];
			int count=1;
			while(temp > 10)
			{
				temp/=10;
				count*=10;
			}
			a[i]%=count;
			a[i]*=10;
			a[i]+=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}