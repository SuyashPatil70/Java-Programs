/*
11	12	13	14	15
	7	8	9	10
		4	5	6
			2	3
				1
KLMNO
 GHIJ
  DEF
   BC
    A
*/
class SpaceAlphabet16{
	public static void main(String suy[]){
	int n=5;
	int count=((n*(n-1))/2)+1;
	for(int i=n;i>=1;i--)
	{
	int c= count;
	for(int j=i;j<n;j++)
	{
	System.out.print(" ");
	}
	for(int j=i;j>=1;j--)
	{
	System.out.print((char)(c+64));
	c++;
	}
	System.out.println();
	count-=i-1;
	}
}
}