/*
EeEeE
DdDdD
CcCcC
BbBbB
AaAaA
*/
class Pattern4{
	public static void main(String suy[]){
	int n=5;
	for(int i=n;i>=1;i--)
	{
	for(int j=1;j<=n;j++)
	if(j%2!=0)
		System.out.print((char)(i+64));
	else
		System.out.print((char)(i+96));
	System.out.println();
	}
}
}