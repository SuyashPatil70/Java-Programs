/*
EdCbA
EdCbA
EdCbA
EdCbA
EdCbA
*/
class Pattern3{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=n;j>=1;j--)
	{
	if(j%2!=0)
		System.out.print((char)(j+64));
	else
		System.out.print((char)(j+96));
	}
	System.out.println();
	}
}
}