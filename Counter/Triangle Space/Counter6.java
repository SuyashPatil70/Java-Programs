/*
5	9	12	14	15
4	8	11	13
3	7	10
2	6
1
*/
class Counter6{
	public static void main(String suy[]){
	int n=5;
	int count=5;
	for(int i=1;i<=n;i++)
	{
	int c=count;
	for(int j=n;j>=i;j--)
	{
	System.out.print(c+"\t");
	c+=j-1;

	}
	count--;
	System.out.println();
	}
}}