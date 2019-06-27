import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code hereanner
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int sum[]=new int[n];
    int j=0;
    sum[j]=a[0];
    for(int i=0;i<n-1;i++)
    {
      if(a[i]<a[i+1])
        sum[j]+=a[i+1];
      else
      {
        j++;
        sum[j]=a[i+1];
      }
    }
    int large=0;
    for(int i=0;i<j+1;i++)
    {
      if(large<sum[i])
        large=sum[i];
    }
    System.out.print(large);
    
    
  }
}