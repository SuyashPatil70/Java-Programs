class Demo1{
	public static void main(String suy[])
	{
		String s1="Suy";
		String s2="ash";
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s2);
		//System.out.println(sb);
		sb.reverse().toString();
		System.out.println(sb);
		System.out.println(s1+s2);
		System.out.println(new StringBuilder(s1+s2).reverse().toString());
	}
}