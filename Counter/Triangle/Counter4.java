/*

15
13	14
10	11	12
6	7	8	9
1	2	3	4	5

*/

class Counter4{
  public static void main(String siy[]){
   int count=15;
    for(int i=1;i<=5;i++)
	{
	int c=count;
	for(int j=i;j>=1;j--)
	{
         System.out.print(c+"\t");
	 c++;
	}
         count=count-i-1;
	 System.out.println();
	}
}
}