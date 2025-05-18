class Pro2{
	public static void main(String suy[])
	{
		String s1="Suyash";
		StringBuilder sb = new StringBuilder(s1);
		char c = sb.charAt(sb.length()-1);
		sb.insert(0,c);
		sb.deleteCharAt(sb.length()-1);
		c=sb.charAt(1);
		sb.deleteCharAt(1);
		sb.append(c);
		System.out.println(sb);
	}
}