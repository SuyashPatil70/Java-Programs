/*

    1
   212
  32123
 4321234
543212345 

*/
class Pyramid12{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<n;j++)
	{
		System.out.print(" ");
	}
	for(int j=i;j>=1;j--)
		System.out.print(j);
	for(int j=2;j<=i;j++)
		System.out.print(j);
	System.out.println();
	}
}
}