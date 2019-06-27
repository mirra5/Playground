import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();
      int n=sc.nextInt();
      String aa[]=b.split(" ");
      for(int i=0;i<aa.length;i++)
        System.out.println(aa[i]);
    }
}