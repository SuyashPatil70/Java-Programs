import java.util.Arrays;
class SwapFirstToLastWithotThird{
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		a[0]+=a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]-=a[a.length-1];
		System.out.println(Arrays.toString(a));
		
	}
}