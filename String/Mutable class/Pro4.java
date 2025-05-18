class Pro4{
	public static void main(String suy[])
	{
		String s1= "Suyash";
		StringBuilder sb = new StringBuilder(s1);
		char c =sb.charAt(0);
		sb.deleteCharAt(0);
		sb.append(c);
		System.out.println(sb); 
	}
}