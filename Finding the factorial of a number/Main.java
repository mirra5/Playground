import java.util.*;
class Main
{
  public static int fact(int n)
  {
    if(n==1)
      return 1;
    else
      return n*fact(n-1);
  }
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(fact(n));
  }
}