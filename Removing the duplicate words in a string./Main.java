import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String a[]=s.split(" ");
    int count=0;
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if(a[i].equals(a[j]))
          count=1;
      }
     if(count==0)
        System.out.print(a[i]+" ");
      count=0;
    }
  }
}