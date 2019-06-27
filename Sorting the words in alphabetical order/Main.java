import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s[]=new String[n];
    for(int i=0;i<n;i++)
      s[i]=sc.next().toLowerCase();
    String temp;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(s[i].charAt(0)<s[j].charAt(0))
        {
          //System.out.println(s[i].charAt(0));
          temp=s[i];
          s[i]=s[j];
          s[j]=temp;
        }
      }
    }
   for(int i=0;i<n;i++)
      System.out.println(s[i]);
        
  }
}