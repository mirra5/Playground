import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int large=0,f=0;
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        if(a[i]>large)
          large=a[i];
      }
      for(int i=large;i>=1;i--)
      {
        f=0;
        for(int j=0;j<n;j++)
        {
          if (i==a[j])
            f=1;
          
        }
        if(f==0)
          System.out.print(i);
      }
    }
}