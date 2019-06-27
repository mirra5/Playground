import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int base,exp;
      base=sc.nextInt();
      exp=sc.nextInt();
      int c=0,sum=1;
      while(c!=exp)
      {
        sum=sum*base;
        c++;
      }
      System.out.println(sum);
    }
}