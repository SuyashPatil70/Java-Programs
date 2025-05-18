class Pro3{
	public static void main(String suy[])
	{
		String s="India";
		StringBuilder sb = new StringBuilder(s.substring(1));
		sb.append(s.charAt(0));
		System.out.println(sb);
	}
}