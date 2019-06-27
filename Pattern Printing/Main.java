import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      for(int i=row;i>0;i--)
      {
        int c=row;
        for(int j=col;j>0;j--)
        {
          if(i>=j)
          {
           // c=row;
            System.out.print(i);
            
        }
          else
            System.out.print(c--);
      }
        System.out.println();
    }
    }
}