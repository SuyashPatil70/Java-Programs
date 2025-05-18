class Pro1{
	public static void main(String suy[])
	{
		String s = "Suyash";
		String s1="";
		for(int i=1;i<s.length();i++)
			s1+=s.charAt(i);
		s1+=s.charAt(0);
		System.out.println(s1);
	}
}