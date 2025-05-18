class Pro25{
	public static void main(String suy[])
	{
		String s1="Welcome to 2025";
		int sum=0;
		for(int i=0;i<s1.length();i++)
			if(Character.isDigit(s1.charAt(i)))
				sum+=Character.getNumericValue(s1.charAt(i));
		System.out.println(sum);
	}
}