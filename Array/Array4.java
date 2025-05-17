class Array4{
	public static void main(String suy[])
	{
		int a[]={1,2,3,4,5};
		double avg = 0;
		for(int i=0;i<=a.length-1;i++)

			avg += a[i];
			avg /= a.length;
		
		System.out.println("Avg = "+avg);
	}
}