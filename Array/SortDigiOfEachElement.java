import java.util.Arrays;
class SortDigiOfEachElement{
	public static void main(String suy[])
	{
		int a[]={121,574,867,342,546};
		for(int i=0;i<=a.length-1;i++)
		{
			int temp=a[i],length=0;
			while(temp!=0)
			{
				temp/=10;
				length++;
			}
		int b[] = new int [a.length];
		for(int j=0;j<=b.length-1;j++)
		{
			b[j]=a[i]%10;
			a[i]/=10;
		}
		Arrays.sort(b);
		for(int j=0;j<=b.length-1;j++)
		{
			a[i]*=10;
			a[i]+=b[j];
		}
		}
		System.out.println(Arrays.toString(a));
	}
}