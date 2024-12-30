/*
       A                      1
      BC                   2  3
     DEF                4  5  6
    GHIJ             7  8  9  10
   KLMNO         11  12 13 14 15		
*/
class SpaceAlphabet1{
	public static void main(String suy[]){
	int n=5;
	int count=1;	
	for(int i=1;i<=n;i++)
	{
	int c= count;
	for(int j=i;j<n;j++)
	{
	System.out.print(" ");
	}
	for(int j=i;j>=1;j--)
	{
	System.out.print((char)(c+64));
	c++;
	}
	System.out.println();
	count +=i;
	}
}
}