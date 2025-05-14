/*
A B C D E	1	2	3	4	5
F G H I 	6	7	8	9
J K L		10	11	12
M N		13	14
O		15
*/
class Alphabet4{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<=n;j++)
	{
	System.out.print((char)(count+64));
	count++;
	}
	System.out.println();
	}
}
}