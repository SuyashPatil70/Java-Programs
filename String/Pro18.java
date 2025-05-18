class Pro18{
	public static void main(String suy[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		StringBuilder sb = new StringBuilder();
		StringBuilder last=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			sb.append(s2[i].substring(1));
			last.append(s2[i].charAt(0));
			sb.append(" ");
		}
		sb.append(last);
		System.out.println(sb);
	}
}