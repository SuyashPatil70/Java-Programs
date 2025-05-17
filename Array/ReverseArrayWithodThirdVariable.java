import java.util.Arrays;
class ReverseArrayWithodThirdVariable{
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,5,6};
		for(int i=0;i<a.length/2;i++)
		{
			a[i]+=a[a.length-1-i];
			a[a.length-1-i]=a[i]-a[a.length-1-i];
			a[i]-=a[a.length-1-i];
		}
		System.out.println(Arrays.toString(a));
	}
}