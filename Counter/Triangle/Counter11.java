/*
11
7       12
4       8       13
2       5       9       14
1       3       6       10      15

*/
class Counter11{
public static void main(String suy[]){
  int n=5;
  int count=((n*(n-1))/2)+1;
	for(int i=5;i>=1;i--){
	 int c=count;
	for(int j=i;j<=n;j++){
	  System.out.print(c+"\t");
           c+=j+1;
	}
        count-=i-1;
	System.out.println();
	}

}
}