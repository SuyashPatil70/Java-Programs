class Pro9{
	public static void main(String suy[])
	{
		String s1="International";
		StringBuilder sb= new StringBuilder();
		String s2="AEIOUaeiou";
		for(int i=0;i<s1.length();i++)
			if(!s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(s1.charAt(i));
		for(int i=0;i<s1.length();i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(s1.charAt(i));
		System.out.println(sb);
	}
}
