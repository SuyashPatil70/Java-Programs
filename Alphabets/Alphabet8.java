/*
AFJMO	1	6	10	13	15
BGKN	2	7	11	14
CHL	3	8	12
DI	4	9
E	5
*/
class Alphabet8{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=n;j>=i;j--)
	{
	System.out.print((char)(c+64));
	c+=j;
	}
	System.out.println();
	count++;
	}
}
}