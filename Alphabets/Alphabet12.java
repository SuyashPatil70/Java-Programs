/*
ACFJO	1	3	6	10	15
BEIN	2	5	9	14
DHM	4	8	13
GL	7	12	
K	11
*/
class Alphabet12{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=i;j<=n;j++)
	{
	System.out.print((char)(c+64));
	c+=j+1;
	}
	System.out.println();
	count+=i;
	}
}
}