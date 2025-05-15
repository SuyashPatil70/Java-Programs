/*

    1
   222
  33333
 4444444
555555555



*/
class Pyramid15{
	public static void main(String suy[]){
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<n;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=(i*2)-1;j++)
	{     
		if(i%2!=0)
			System.out.print((char)(i+64));
		else
			System.out.print((char)(i+96));
	}
	System.out.println();
	}
}
}