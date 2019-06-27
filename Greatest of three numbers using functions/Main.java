import java.util.Scanner;
class Main{
  public static int greatest(int a, int b, int c)
  {
    return (a>b)?((a>c)?a:c):((b>c)?b:c);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      System.out.println(greatest(a,b,c));
	}
}