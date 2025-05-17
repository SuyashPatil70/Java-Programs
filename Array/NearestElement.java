import java.util.Arrays;
class NearestElement{
//WAP to find nearest element from array
	public static void main(String suy[])
	{
		int a[]={12,18,15,10,13,21,29,16,23,30,20,14};
		Arrays.sort(a);
		int min=a[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
			int diff=Math.abs(a[i]-a[i+1]);
			if(min>diff && diff !=0)
				min=diff;
		}
		for(int i=0;i<a.length-1;i++)
			if(min==Math.abs(a[i]-a[i+1]))
				System.out.println(a[i]+" "+a[i+1]);
	}
}