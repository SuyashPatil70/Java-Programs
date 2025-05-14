/*
1
1F
1E1
1D1C
1B1A1
*/
class Pattern6{
	public static void main(String suy[]){
	int n=5;
	int count=(n*n)/4;
	for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=i;j++)
	{
	if(j%2!=0)
		System.out.print(1);
	else
		System.out.print((char)(count--+64));
	}
	System.out.println();
	}
}
}