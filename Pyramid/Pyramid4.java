/*

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********


*/
class Pyramid4{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j>1;j--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=((n-i+1)*2)-1;j++)
	{
		System.out.print("*");
	}
	System.out.println();
	}
	for(int i=n-1;i>=1;i--)
	{
	for(int j=i;j>1;j--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=((n-i+1)*2)-1;j++)
	{
		System.out.print("*");
	}
	System.out.println();
	}
}
}