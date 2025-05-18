class Pro10{
	public static void main(String suy[])
	{
		String s1="International";
		StringBuilder sb= new StringBuilder();
		StringBuilder vow = new StringBuilder();
		String s2="AEUIOaeiou";
		for(int i=0;i<s1.length();i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
				vow.append(s1.charAt(i));
			else
				sb.append(s1.charAt(i));
		sb.append(vow);
		System.out.println(sb);
		
	}
}