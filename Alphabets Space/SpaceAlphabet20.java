/*
11	7	4	2	1
	12	8	5	3
		13	9	6
			14	10
				15
KGDBA
 LHEC
  MIF
   NJ
    O

*/
class SpaceAlphabet20{
	public static void main(String suy[]){
	int n=5;
	int count=((n*(n-1))/2)+1;
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
	c-=j-1;
	}
	System.out.println();
	count++;
	}
}
}