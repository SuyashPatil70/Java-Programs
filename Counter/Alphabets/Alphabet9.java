/*
EILNO	5	9	12	14	15
DHKM	4	8	11	13
CGK	3	7	10
BF	2	6
A	1
*/
class Alphabet9{
	public static void main(String suy[]){
	int n=5;
	int count=5;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=n;j>=i;j--)
	{
	System.out.print((char)(c+64));
	c +=j-1;
	}
	System.out.println();
	count--;
	}
}
}