/*

  

*/
class Pyramid11{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<n;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=(i*2)-1;j++)
	{
		System.out.print(i);
	}
	System.out.println();
	}
}
}