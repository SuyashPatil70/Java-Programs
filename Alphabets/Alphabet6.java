/*
EDCBA	5	4	3	2	1
IHGF	9	8	7	6
LKJ	12	11	10
NM	14	13
O	15
*/
class Alphabet6{
	public static void main(String suy[]){
	int n=5;
	int count=5;
	for(int i=n;i>=1;i--)
	{
	int c= count;
	for(int j=i;j>=1;j--)
	{
	System.out.print((char)(c+64));
	c--;
	}
	System.out.println();
	count+=i-1;
	}
}
}