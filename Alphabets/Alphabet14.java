/*
OMJFA	15	13	10	6	1
NKGB	14	11	7	2
LHC	12	8	3
ID	9	4
E	5
*/
class Alphabet14{
	public static void main(String suy[]){
	int n=5;
	int count=(n*(n+1))/2;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=i;j<=n;j++)
	{
	System.out.print((char)(c+64));
	c-=j+1;
	}
	System.out.println();
	count-=i;
	}
}
}