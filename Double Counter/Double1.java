/*
AO	FM	JJ	MF	OA
	BN	GK	JG	NB
		CL	HH	LC		
			DI	ID
				EE
15	13	10	6	1
	14	11	7	2
		12	8	3
			9	4
				5
*/
class Double1{
	public static void main(String suy[]){
	int n=5;
	int count1=1;
	int count2=(n*(n+1))/2;
	for(int i=1;i<=n;i++)
	{
	int c1=count1;
	int c2=count2;
	for(int j=i;j>1;j--)
	{
	System.out.print("\t");
	}
	for(int j1=n,j2=i;j1>=i||j2<=n;j1-- , j2++)
	{
	System.out.print((char)(c1+64));
	System.out.print((char)(c2+64));
	System.out.print("\t");
	c1+=j1;
	c2-=j2+1;
	}
	System.out.println();
	count1++;
	count2-=i;
	}
}
}