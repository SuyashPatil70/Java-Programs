/*
15
14	13
12	11	10
9	8	7	6
5	4	3	2	1
*/
class Counter2{
  public static void main(String suy[]){
    int count=15;
   for(int i=1;i<=5;i++)
	{
           for(int j=i;j>=1;j--)
	{
           System.out.print(count+"\t");
	   count--;
	}
	 System.out.println();
	}
}

}