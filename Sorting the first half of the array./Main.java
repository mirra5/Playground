import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int mid,temp;
      mid=(n/2)-1;
    for(int i=0;i<=mid;i++)
    {
      for(int j=0;j<=mid;j++){
        if(a[i]<a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}