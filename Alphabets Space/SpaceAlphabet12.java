/*
				1
			6	2
		10	7	3
	13	11	8	4
15	14	12	9	5
*/
class SpaceAlphabet12{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=n;i>=1;i--)
	{
	int c= count;
	for(int j=i;j>1;j--)
	{
	System.out.print(" ");
	}
	for(int j=i;j<=n;j++)
	{
	System.out.print((char)(c+64));
	c-=j;
	}
	System.out.println();
	count+=i;
	}
}
}