import java.util.Scanner;
class Main{
  public static int power(int x,int y)
  {
    int pow=1;
    for(int i=1;i<=y;i++)
    {
      pow=pow*x;
    }
    return pow;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exp=sc.nextInt();
      System.out.println(power(base,exp));
      
	}
}