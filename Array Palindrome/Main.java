import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int f=1,j=n-1;
      for(int i=0;i<n;i++,j--)
      {
          if(a[i]==a[j])
            continue;
          else
          {
            f=0;
            System.out.println("No");
            break;
          }
      }
      if(f==1)
        System.out.print("Yes");
    }
}