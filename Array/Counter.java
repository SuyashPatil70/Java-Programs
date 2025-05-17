/*
				5
			9	4
		12	8	3
	14	11	7	2
15	13	10	6	1
	
*/
class Counter{
	public static void main(String suy[])
	{
		int n=5;
		int count1=5;
		int count=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			int c=count;
			int c1= count1;
			for(int j=n,j1=i;j>=i||j1<=n;j--,j1++)
			{
				
				if(j%2!=0)
					System.out.print((char)(c+64));
				else
					System.out.print((char)(c+96));
				c+=j-1;
				if(j1%2!=0)
					System.out.print((char)(c1+64));
				else
					System.out.print((char)(c1+96));
				c1-=j1+1;
				System.out.print("\t");
				
			}
			count++;
			count1+=i-1;
			System.out.println();
		}
	}
}