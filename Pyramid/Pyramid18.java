/*

123454321
 2345432
  34543
   454
    5


*/
class Pyramid18{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j>1;j--)
	{
		System.out.print(" ");
	}
	for(int j=i;j<=n;j++)
	{
		System.out.print(j);
	}
	for(int j=4;j>=i;j--)
	{
		System.out.print(j);
	}
	System.out.println();
	}
}
}