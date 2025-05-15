/*
543212345
 4321234
  32123
   212
    1
   212
  32123
 4321234
543212345

EdCbAbCdE
 EdCbCdE
  EdCdE
   EdE
    E
   EdE
  EdCdE
 EdCbCdE
EdCbAbCdE

*/
class DoublePyramid9{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j>1;j--)
	{
	System.out.print(" ");
	}
	for(int j=n;j>=i;j--)
	{
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	for(int j=i+1;j<=n;j++)
	{
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	System.out.println();
	}
	for(int i=n-1;i>=1;i--)
	{
	for(int j=i;j>1;j--)
	{
	System.out.print(" ");
	}
	for(int j=n;j>=i;j--)
	{
		if(j%2!=0)
			System.out.print((char)(j+64));
		else
			System.out.print((char)(j+96));
	}
	for(int j=i+1;j<=n;j++)
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