class Swastik{
	public static void main(String suy[]){
	int n=7;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==(n/2)+1 || j==(n/2)+1)
				System.out.print("*");
			else if(i==1 && j>(n/2)+1)
				System.out.print("*");
			else if(i==n && j<(n/2)+1)
				System.out.print("*");
			else if(j==1 && i<(n/2)+1)
				System.out.print("*");
			else if(j==n && i>(n/2)+1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
	System.out.println();
	}
}
}