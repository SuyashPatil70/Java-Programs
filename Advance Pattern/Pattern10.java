/*

    *
   *
  *
 *
*


*/
class Pattern10{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j>1;j--)
		System.out.print(" ");
	for(int j=i;j>=1;j--)
	{
		if(j==i)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
	}
}
}