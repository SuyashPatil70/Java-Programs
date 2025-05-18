class Pro6{
	public static void main(String suy[])
	{
		String s1="Suyash";
		String s2=s1.toUpperCase();
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				count++;
		}
		System.out.println(count);
	}
}