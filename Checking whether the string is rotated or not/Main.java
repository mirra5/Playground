import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String ss=sc.next();
      s=s.concat(s);
      if(s.contains(ss))
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}