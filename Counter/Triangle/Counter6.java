/
class Counter6{
 
public static void main(String suy[]){
  
  int count =5;
   for(int i=5;i>=1;i--)
	{
         int c=count;
	for(int j=5;j>=i;j--)
	{
	  System.out.print(c+"\t");
          c+=j;
	}
	System.out.println();
        count--;
	}
 
}

}