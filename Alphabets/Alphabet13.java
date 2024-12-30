/*
ABDGK	1	2	4	7	11
CEHL	3	5	8	12
FIM	6	9	13
JN	10	14
O	15
*/
class Alphabet13{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=i;j<=n;j++)
	{
	System.out.print((char)(c+64));
	c+=j;
	}
	System.out.println();
	count+=i+1;
	}
}
}