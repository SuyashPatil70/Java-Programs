class Pro5{
	public static void main(String suy[])
	{
		String s1="Suyash";
		StringBuilder sb =new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		for(int i=0;i<s1.length()-1;i++)
			sb.append(s1.charAt(i));
		System.out.println(sb);
	}
}