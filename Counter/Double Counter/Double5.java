/*
1	2	4	7	11
3	5	8	12
6	9	13
10	14
15

Ea      Db      Cd      Bg      Ak
Ic      He      Gh      Fl
Lf      Ki      Jm
Nj      Mn
Oo

*/
class Double5{
	public static void main(String suy[]){
	int n=5;
	int count1=n;
	int count2=1;
	for(int i=n,i1=1;i>=1||i1<=n;i--,i1++)
	{
	int c1= count1;
	int c2= count2;
	for(int j1=i,j2=i1;j1>=1||j2<=n;j1--,j2++)
	{
	System.out.print((char)(c1+64));
	System.out.print((char)(c2+96));
	System.out.print("\t");
	c1--;
	c2 +=j2;
	}
	System.out.println();
	count1 +=i-1;
	count2 +=i1+1;
	}
}
}