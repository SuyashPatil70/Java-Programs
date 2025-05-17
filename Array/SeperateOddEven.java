import java.util.Arrays;
class SeperateOddEven{
//Wap to seperate odd and even element from array.
	public static void main(String suy[])
	{
		int a[]={23,22,34,33,44,45,65,67,44,56,76,89};
		int b[]= new int [a.length];
		int count=0;
		for(int i=0;i<=a.length-1;i++)
			if(a[i]%2!=0)
				b[count++]=a[i];
		for(int i=0;i<=a.length-1;i++)
			if(a[i]%2==0)
				b[count++]=a[i];
		System.out.println(Arrays.toString(b));
	}
}