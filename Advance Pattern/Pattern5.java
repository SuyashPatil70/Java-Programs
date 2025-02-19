/*

*********
 *     *
  *   *
   * *
    *

*/
class Pattern5{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j>1;j--)
		System.out.print(" ");
	if(i==1)
		for(int j=1;j<=(n*2)-1;j++)
			System.out.print("*");

	else
	{
		for(int j=1;j<=(n-i+1)*2-1;j++)
			if(j==1 || j==(n-i+1)*2-1  )
				System.out.print("*");
			else
				System.out.print(" ");	
	}
	System.out.println();
	}
}
}