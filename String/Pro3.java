class Pro3{
	public static void main(String suy[])
	{
		String s1="Suyash";
		StringBuilder sb = new StringBuilder(s1);
		int count=0;
		for(int i=sb.length()-1;i>=0;i--)
			sb.insert(i+1,++count);
		System.out.println(sb);
	}
}