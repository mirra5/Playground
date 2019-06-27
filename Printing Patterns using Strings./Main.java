import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int row=s.length();
    int mid=s.length()/2;
    int space=row-1;
    int z=mid+1;
    for(int i=mid;i<row;i++)
    {
      for(int j=0;j<space;j++)
        System.out.print(" ");
      System.out.println(s.substring(mid,z++));
    space--;
    }
    String kri=s.substring(mid,--z);
    for(int i=0;i<mid;i++)
    {
      for(int j=0;j<space;j++)
        System.out.print(" ");
      kri=kri+(s.charAt(i));
      System.out.println(kri);
      space--;
    }
  }
}