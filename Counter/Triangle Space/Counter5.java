/*
1	6	10	13	15
2	7	11	14
3	8	12
4	9
5

*/
class Counter5{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=1;i<=5;i++)
	{
	int c= count;
	for(int j=n;j>=i;j--)
	{
	System.out.print(c+"\t");
	c+=j;
	}
	System.out.println();
	count++;
	}
}
}