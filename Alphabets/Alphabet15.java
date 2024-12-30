/*
ONLIE	15	14	12	9	5
MKHD	13	11	8	4
JGC	10	7	3
FB	6	2
A	1
*/
class Alphabet15{
	public static void main(String suy[]){
	int n=5;
	int count=(n*(n+1))/2;
	for(int i=1;i<=n;i++)
	{
	int c=count;
	for(int j=i;j<=n;j++)
	{
	System.out.print((char)(c+64));
	c-=j;
	}
	System.out.println();
	count-=i+1;
	}
}
}