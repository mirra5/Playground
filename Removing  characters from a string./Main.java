import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String ss=sc.next();
    int f=1;
    for(int i=0;i<s.length();i++)
    {
      f=1;
      for(int j=0;j<ss.length();j++)
      {
        if(s.charAt(i)==ss.charAt(j)){
           f=0;
           break;
           }
      }
      if(f==1)
        System.out.print(s.charAt(i));
    }
           
  }
}