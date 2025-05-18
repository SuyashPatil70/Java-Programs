class Pro28{
	public static void main(String suy[])
	{
		String s1="hello naman,,. where is nikhil?? kartik looking for him!!!";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			char c= s1.charAt(i);
			if((Character.isLetterOrDigit(c) || Character.isWhitespace(c)))
				sb.append(c);
		}
		System.out.println(sb);
	}
}