import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int sum=0;
    for(int i=1;i<=num;i++)
    {
      sum+=i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum(n));
	}
}