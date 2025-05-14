/*
1	2	3	4	5
	6	7	8	9
		10	11	12
			13	14
				15
ABCDE
 FGHI
  JKL
   MN
    O

*/
class SpaceAlphabet13{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j>1;j--)
	{
	System.out.print(" ");
	}
	for(int j=i;j<=n;j++)
	{
	System.out.print((char)(count+64));
	count++;
	}
	System.out.println();
	
	}
}
}