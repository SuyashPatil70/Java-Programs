class Pro13
{
	public static void main(String suy[])
	{
		String s1="International";
		String s2="AEIOUaeiou";
		StringBuilder sb = new StringBuilder();
		int count=1;
		for(int i=0;i<s1.length();i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
			{
				if(count==1)
				{
					sb.append(count);
					count=2;
				}
				else
				{
					sb.append(count);
					count=1;
				}
			}
			else
				sb.append(s1.charAt(i));
		System.out.println(sb);
	}
}