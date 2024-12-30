/*
		
OO	NJ	LF	IC	EA
MN	KI	HE	DB
JM	GH	CD
FL	BG
AK
	
15 15	14 10	12 6	9 3	5 1
13 14	11 9	8 5	4 2
10 13	7 8	3 4
6 12	2 7
1 11
*/
class Double2{
	public static void main(String suy[]){
	int n=5;
	int count1=(n*(n+1))/2;
	int count2=count1;
	for(int i=1;i<=n;i++)
	{
	int c1= count1;
	int c2=count2;
	for(int j1=i,j2=n;j1<=n||j2>=i;j1++,j2--)
	{
	System.out.print((char)(c1+64));
	System.out.print((char)(c2+64));
	System.out.print("\t");
	c1 -=j1;
	c2 -=j2;
	}
	System.out.println();
	count1 -=i+1;
	count2--;
	}
}
}