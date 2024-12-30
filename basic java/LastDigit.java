class Secondlastdigit{
  public static void main(String suy[]){
    int a=12345;
    int rem=a % 10;
    int temp=a-rem;
    rem=temp%10;
   System.out.println("Last digit of number="+rem);

}
}