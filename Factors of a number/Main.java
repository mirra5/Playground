import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int f=1;
      for(int i=1;i<=n;i++)
      {
        if(n%i==0)
          f=0;
        if(f==0)
          System.out.println(i);
        f=1;
      }
	}
}