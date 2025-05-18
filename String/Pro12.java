class Pro12{
	public static void main(String suy[])
	{
		String s1="International";
		String s2="AEIOUaeuio";
		StringBuilder sb= new StringBuilder();
		int count=1;
		for(int i=0;i<s1.length();i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
			{
				if(count%2!=0)
					sb.append(1);
				else
					sb.append(2);
				count++;
			}
			else
				sb.append(s1.charAt(i));
		System.out.println(sb);
	}
}