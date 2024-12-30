/*
A		1
B F 		2 6
C G J		3 7 10
D H K M		4 8 11 13
E I L N O	5 9 12 14 15
*/
class Alphabet3{
	public static void main(String suy[]){
	int n=5;
	int count=1;
	for(int i=n;i>=1;i--)
	{
	int c=count;
	for(int j=n;j>=i;j--)
	{
	System.out.print((char)(c+64));
	c+=j-1;
	}
	System.out.println();
	count++;
	}
}
}