/*

543212345
 4321234
  32123
   212
    1

*/
class Pyramid19{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j>1;j--)
	{
		System.out.print(" ");
	}
	for(int j=n;j>=i;j--)
	{
		System.out.print(j);
	}
	for(int j=i+1;j<=n;j++)
	{
		System.out.print(j);
	}
	System.out.println();
	}
}
}