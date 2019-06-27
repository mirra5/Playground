import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int large=a[0]+a[1]+a[2];
    int flag=0;
    for(int i=3;i<n;i=i+3)
    {
      if((a[i]+a[i+1]+a[i+2])==large)
        flag=0;
      else{
        flag=1;break;
      }
    }
    if(flag==0)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
      
  }
}