class Pro17{
	public static void main(String suy[])
	{
		String s1="Hello i am java developer";
		String s2[]=s1.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			if(temp.length()!=0)
			{
				sb.append(temp.substring(1));
				sb.append(temp.charAt(0));
			}
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}