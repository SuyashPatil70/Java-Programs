import java.util.Arrays;
class MergTwoArray{
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,0,52};
		int b[]={6,7,8,9,0,2,4};
		int c[]= new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
			c[i]=a[i];
		for(int i=0;i<=b.length-1;i++)
			c[a.length+i]=b[i];
		System.out.println(Arrays.toString(c));
	}
}