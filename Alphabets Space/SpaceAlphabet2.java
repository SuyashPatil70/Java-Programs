/*
    O	    				15
   NM				14	13
  LKJ			12	11	10
 IHGF		9	8	7	6
EDCBA	5	4	3	2	1
*/

class SpaceAlphabet2{
	public static void main(String suy[]){
	int n=5;
	int count=(n*(n+1))/2;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=i;j<n;j++)
	{
	System.out.print(" ");
	}
	for(int j=i;j>=1;j--)
	{
	System.out.print((char)(c+64));
	c--;
	}
	System.out.println();
	count-=i;
	}
}
}