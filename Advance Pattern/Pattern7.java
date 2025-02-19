/*



*/
class Pattern7{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<=n;j++)
	{
		if(j==i  ||j==n || i==n)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
	}
}
}