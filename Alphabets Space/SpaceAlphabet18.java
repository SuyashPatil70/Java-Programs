/*
5	9	12	12	15
	4	8	11	13
		3	7	10
			2	6
				1
EILNO
 DHKM
  CGJ
   BF
    A
*/
class SpaceAlphabet18{
	public static void main(String suy[]){
	int n=5;
	int count=n;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=i;j>1;j--)
	{
	System.out.print(" ");
	}
	for(int j=n;j>=i;j--)
	{
	System.out.print((char)(c+64));
	c+=j-1;
	}
	System.out.println();
	count--;
	}
}
}