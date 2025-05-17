import java.util.Arrays;
class DifferenceElement{
	public static void main(String suy[])
	{
		int a[]={121,223,443,556,3223,22,34};
		int b[]= new int[a.length-1];
		for(int i=0;i<=a.length-2;i++)
			b[i]=Math.abs(a[i]-a[i+1]);
		System.out.println(Arrays.toString(b));
	}
}