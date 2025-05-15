/*

    5
   454
  34543
 2345432
123454321
    E
   dEd
  CdEdC
 bCdEdCb
AbCdEdCbA
*/
class Pyramid22{
	public static void main(String suy[]){
	int n=5;
	for(int i=n;i>=1;i--)
	{
	for(int j=i;j>1;j--)
	{
		System.out.print(" ");
	}
	for(int j=i;j<=n;j++)
	{
	
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	for(int j=4;j>=i;j--)
	{
	
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	System.out.println();
	}
}
}