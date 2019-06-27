import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int count=0,subcount=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if((a[i]<a[j]))
        {
          subcount=a[j]-a[i];
          if(subcount>count || count==0)
          System.out.println(a[i]+","+a[j]);
        }
        if(subcount>count){
          count=subcount;
        subcount=0;
      }
      }
        
        subcount=0;
        count=0;
      
    }
    
  }
}