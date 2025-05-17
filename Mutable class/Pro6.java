class Pro6{
	public static void main(String suy[])
	{
		String s1="Suyash";
		StringBuilder sb= new StringBuilder(s1);
		sb.insert(0,sb.charAt(sb.length()-1));
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}