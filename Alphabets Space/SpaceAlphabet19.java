/*
15	10	6	3	1
	14	9	5	2
		13	8	4
			12	7
				11
OJFCA
 NIEB
  MHD
   LG
    K
*/
class SpaceAlphabet19{
	public static void main(String suy[]){
	int n=5;
	int count=(n*(n+1))/2;
	for(int i=1;i<=n;i++)
	{
	int c=count;
	for(int j=i;j>1;j--)
	{
	System.out.print(" ");
	}
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