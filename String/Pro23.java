class Pro23{
	public static void main(String suy[])
	{
		String s1="whrere is naman and nayan and karan looking for him";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			if (temp.equalsIgnoreCase(new StringBuilder(temp).reverse().toString()))
				System.out.println(temp);
		}
	}
		
}