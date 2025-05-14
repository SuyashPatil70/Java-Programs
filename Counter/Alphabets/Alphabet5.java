/*
ONMLK	15	14	13	12	11
JIHG	10	9	8	7
FED	6	5	4
CB	3	2
A	1
*/
class Alphabet5{
	public static void main(String suy[]){
	int n=5;
	int count=(n*(n+1))/2;
	for(int i=n;i>=1;i--)
	{
	for(int j=i;j>=1;j--)
	{
	System.out.print((char)(count+64));
	count--;
	}
	System.out.println();
	}
}
}