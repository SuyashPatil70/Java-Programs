/*
					11
				12	7
			13	8	4
		14	9	5  	2	
	15	10	6	3	1

    K
   LG
  MHD
 NIEB
OJFCA

*/
class SpaceAlphabet7{
	public static void main(String suy[]){
	int n=5;
	int count=((n*(n-1))/2)+1;
	for(int i=n;i>=1;i--)
	{
	int c= count;
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
	count++;
	}
}
}