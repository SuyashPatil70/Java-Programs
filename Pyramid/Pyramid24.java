/*

123454321
 1234321
  12321
   121
    1

AbCdEdCbA
 AbCdCbA
  AbCbA
   AbA
    A

*/
class Pyramid24{
	public static void main(String suy[]){
	int n=5;
	for(int i=n;i>=1;i--)
	{
	for(int j=i;j<n;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	for(int j=i-1;j>=1;j--)
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