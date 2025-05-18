class Pro14{
	public static void main(String suy[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++)
			if(s2[i].length()!=0)
				count++;
		System.out.println(count);
	}
}