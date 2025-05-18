class Pro2{
	public static void main(String suy[])
	{
		String s1="Suyash";
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<s1.length();i++)
			sb.append(s1.charAt(i));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}
}