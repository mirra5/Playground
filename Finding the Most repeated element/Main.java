import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int temp[]=new int[10];
    for(int i=0;i<n;i++)
    {
      temp[a[i]]++;
    }
    int large=1,var=a[0];
    for(int i=0;i<10;i++)
    {
      if(temp[i]>large){
        large=temp[i];
        var=i;
      }
    }
    System.out.print(var);
  }
}