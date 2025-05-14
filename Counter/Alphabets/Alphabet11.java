/*
KGDCA	11	7	4	2	1
LHEB	12	8	5	3	
MIF	13	9	6
NJ	14	10
O	15
*/
class Alphabet11{
	public static void main(String suy[]){
	int n=5;
	int count=((n*(n-1))/2)+1;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=n;j>=i;j--)
	{
	System.out.print((char)(c+64));
	c-=j-1;
	}
	System.out.println();
	count++;
	}
}
}