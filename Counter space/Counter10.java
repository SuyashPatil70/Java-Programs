/*
1       3       6       10      15
        2       5       9       14
                4       8       13
                        7       12
                                11
*/
class Counter10{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=i;j>1;j--)
	{
	System.out.print("\t");
	}
	for(int j=i;j<=n;j++)
	{
	System.out.print(c+"\t");
	c+=j+1;
	}
	System.out.println();
	count+=i;
	}
}
}