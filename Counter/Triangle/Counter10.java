/*
5
9       4
12      8       3
14      11      7       2
15      13      10      6       1
*/
class Counter10{
public static void main(String suy[]){
  int n=5;
  int count=5;
	for(int i=5;i>=1;i--){
	 int c=count;
	for(int j=i;j<=n;j++){
	  System.out.print(c+"\t");
           c-=j+1;
	}
        count+=i-1;
	System.out.println();
	}

}
}
