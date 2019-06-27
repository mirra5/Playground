import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
     String ss[]=s.split(" ");
      int len=ss.length;
      for(int i=len-1;i>=0;i--)
        System.out.print(ss[i]+" ");
    }
    
}