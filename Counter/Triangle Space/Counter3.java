/*
5	4	3	2	1
9	8	7	6
12	11	10
14	13
15
*/

class Counter3{
public static void main(String suy[]){
	int n=5;
	int count=5;
	for(int i=5;i>=1;i--)
	{
	int c=count;
	for(int j=i;j>=1;j--)
	{
	System.out.print(c+"\t");
	c--;
	}
	System.out.println();
	count+=i-1;
	}
}
}