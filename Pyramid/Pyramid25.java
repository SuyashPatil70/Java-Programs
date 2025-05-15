/*

123454321
 2345432
  34543
   454
    5


*/
class Pyramid25{
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
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	for(int j=4;j>=i;j--)
	{
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	System.out.println();
	}
}
}