class Pro7{
	public static void main(String suy[])
	{
		String s1="Suyash";
		StringBuilder sb = new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		sb.append(s1.substring(0,s1.length()-1));
		System.out.println(sb);
	}
}