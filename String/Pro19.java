/*
output:i am Java Hello Developer
*/
class Pro19{
	public static void main(String suy[])
	{
		String s1="Hello i am Java Developer";
		String s2[]=s1.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s2.length-1;i++)
			for(int j=i+1;j<s2.length;j++)
				if(s2[i].length()>s2[j].length())
					{
						String temp = s2[i];
						s2[i]=s2[j];
						s2[j]=temp;
					}
		for(int i=0;i<s2.length;i++)
		{
			sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}