/*

    *
   **
  * *
 *  *
*****

*/
class Pattern8{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<n;j++)
		System.out.print(" ");
	for(int j=i;j>=1;j--)
	{
		if(j==i || i==n ||j==1)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
	}
}
}