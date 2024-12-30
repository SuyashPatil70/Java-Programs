/*
OJFCA		15	10	6	3	1
NIEB		14	9	5	2
MHD		13	8	4
LG		12	7
K		11
*/
class Alphabet10{
	public static void main(String suy[]){
	int n=5;
	int count=(n*(n+1))/2;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=n;j>=i;j--)
	{
	System.out.print((char)(c+64));
	c-=j;
	}
	System.out.println();
	count--;
	}
}
}