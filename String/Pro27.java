class Pro27{
	public static void main(String suy[])
	{
		String s1="hello naman,,. where is nikhil?? kartik looking for him!!!";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(!(Character.isLetterOrDigit(c) || Character.isWhitespace(c)))
				count++;
		}
		System.out.println(count);
	}
}