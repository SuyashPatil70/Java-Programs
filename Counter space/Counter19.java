/*
                                5
                        4       9
                3       8       12
        2       7       11      14
1       6       10      13      15
*/
class Counter19{
	public static void main(String suy[]){
	int n=5;
	int count=5;
	for(int i=n;i>=1;i--)
	{
	int c= count;
	for(int j=i;j>1;j--)
	{
	System.out.print("\t");
	}
	for(int j=n;j>=i;j--)
	{
	System.out.print(c+"\t");
	c+=j;
	}
	System.out.println();
	count--;
	}
}
}