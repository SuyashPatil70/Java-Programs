class Pro26{
	public static void main(String suy[])
	{
		String s1="Welcome to 2025";
		StringBuilder sb= new StringBuilder();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			if(Character.isDigit(temp.charAt(0)))
			{
				char c[]=temp.toCharArray();
				java.util.Arrays.sort(c);
				sb.append(new String(c));
			}
			else
				sb.append(temp);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}