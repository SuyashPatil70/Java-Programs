import java.util.Arrays;
import java.util.Scanner;
class TwoDArray{
	public static void main(String suy[])
	{
		int a[][]=new int[4][4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter a value a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}	
		
	}
}