/*

    *
   * *
  * * *
 * * * *
* * * * *

*/
class Pyramid2{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<n;j++)
	{
		System.out.print(" ");
	}
	for(int j=i;j>=1;j--)
	{
		System.out.print("* ");
	}
	System.out.println();
	}
}
}