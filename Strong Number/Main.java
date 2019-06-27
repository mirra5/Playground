import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code hereScaystem.inner sc=new Scanner(S
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int fact,r,sum=0;
      while(n>0)
      {
        r=n%10;
        fact=1;
        for(int i=1;i<=r;i++)
          fact*=i;
        sum+=fact;
        n/=10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}