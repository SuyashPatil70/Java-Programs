import java.util.Arrays;
class PairOfNearestArray{
	public static void main(String suy[])
	{
		int a[]={12,18,15,10,13,21,29,16,23,20,14};
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++)
			b[i]=a[i];
		//System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{	
				int diff=0;
				diff=Math.abs(a[i]-b[j]);
				if(diff==1)
					System.out.println(a[i]+","+b[j]);
			}
		}
	}
}