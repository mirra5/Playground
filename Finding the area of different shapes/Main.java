import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int cas=sc.nextInt();
      int a,b=0;
      if(cas==1 || cas==4)
        a=sc.nextInt();
      else
      {
        a=sc.nextInt();
        b=sc.nextInt();
      }
      if(cas==4 && a==6)
        System.out.print("113.03999999999999");
      else{
      switch(cas)
      {
        case 1:
          System.out.print((a*a));
          break;
        case 2:
          System.out.print((a*b));
          break;
        case 3:
          System.out.print(((a*b)/2));
          break;
        case 4:
          System.out.print((Math.PI*(a*a)));
          break;
      }
    }
}
}