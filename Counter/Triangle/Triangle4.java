/*
12345
_1234
__123
___12
____1
*/

class Triangle4
{
 public static void main(String args[])
{
  int n=5;
    for(int i=n;i>=1;i--)
    {
      for(int j=i;j<5;j++)
       {
          System.out.print(" ");

        }
         for(int j=1;j<=i;j++)
          {
            System.out.print(j);
          }
         System.out.println();
       }
     
}
}

