class Pro15{
	public static void main(String suy[])
	{
		String s1="welcome to international international airport";
		String s2[]=s1.split(" ");
		int max=0;
		for(int i=0;i<s2.length;i++)
			if(max<s2[i].length())
				max=s2[i].length();
		for(int i=0;i<s2.length;i++)
			if(max==s2[i].length())
				System.out.println(s2[i]);
	}  
}