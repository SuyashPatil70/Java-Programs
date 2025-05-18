class Pro8{
	public static void main(String suy[])
	{
		String s1="International";
		String s2="AEIOUaeiou";
		int count=0;
		StringBuilder sb = new StringBuilder(s1);
		for(int i=sb.length()-1;i>=0;i--)
			if(s2.contains(String.valueOf(sb.charAt(i))))
			{
				sb.deleteCharAt(i);
				sb.insert(i,++count);
			}
		System.out.printl(b);
	}
}
