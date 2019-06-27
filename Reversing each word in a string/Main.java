import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String ss[]=s.split(" ");
    int l=0;
    for(int i=0;i<ss.length;i++)
    {
      l=ss[i].length();
      for(int j=l-1;j>=0;j--)
        System.out.print(ss[i].charAt(j));
      System.out.print(" ");
    }
  }
}