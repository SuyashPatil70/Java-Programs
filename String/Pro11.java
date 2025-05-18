class Pro11{
	public static void main(String suy[])
	{
		String s1="International";
		char c[]=s1.toCharArray();
		java.util.Arrays.sort(c);
		String s2= new String(c);
		System.out.println(c);
		System.out.println(s2);
	}
}