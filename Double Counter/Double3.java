/*
				EO
			IJ	DN
		LF	HI	CM
	NC	KE	GH	BL
OA	MB	JD	FG	AK



				5
			9	4
		12	8	3
	14	11	7	2
15	13	10	6	1
*/
class Double3{
	public static void main(String suy[]){
	int n=5;
	int count1=(n*(n+1))/2;
	int count2=n;
	for(int i=n;i>=1;i--)
	{
	int c1= count1;
	int c2=count2;
	for(int j=i;j>1;j--)
	{
	System.out.print("\t");
	}
	for(int j1=i,j2=i;j1<=n||j2<=n;j1++,j2++)
	{
        System.out.print((char)(c2+64));
	System.out.print((char)(c1+64));
	
	System.out.print("\t");
	c1 += j1;
	c2 -=j2+1;
	}
	System.out.println();
	count1 -=i;
	count2 +=i-1;
	}
}
}