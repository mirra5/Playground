import java.util.*;
class Main
{
  public static void asc(int[] a,int mid)
  {
    int temp;
    for(int i=0;i<=mid;i++)
    {
      for(int j=0;j<=mid;j++)
      {
        if(a[i]<a[j]){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;}
      }
    }
  }
  public static void dec(int[] a,int mid,int n)
  {
    int temp;
    for(int i=mid+1;i<n;i++)
    {
      for(int j=mid+1;j<n;j++)
      {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    
  }
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int mid=(n/2)-1;
    int temp;
    asc(a,mid);
    dec(a,mid,n);
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}