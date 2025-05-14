/*
55555
44445
33345
22345
12345
*/
class Pattern9{
	public static void main(String suy[]){
	int n=5;
	for(int i=n;i>=1;i--)
	{
	for(int j=1;j<=n;j++)
	{
	if(i<j)//i>j print i
		System.out.print(j);
	else //print j
		System.out.print(i);
	}
	System.out.println();
	}
}
}