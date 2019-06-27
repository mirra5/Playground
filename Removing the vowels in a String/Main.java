import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char a[]=s.toCharArray();
    for(int i=0;i<a.length;i++)
    {
      if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
        continue;
      else
        System.out.print(a[i]);
    }
  }
}