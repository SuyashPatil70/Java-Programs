/*
output:D:\JAP76\String>java Pro20
ellho i am avja evelopedr
*/
class Pro20{
	public static void main(String suy[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			if(temp.length()>1)
			{
				sb.append(temp.substring(1,temp.length()-1));
				sb.append(temp.charAt(0));
			}
			sb.append(temp.charAt(temp.length()-1));
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}