import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String sb=sc.next();
      //StringBuilder sb=new StringBuilder(s);
      //StringBuilder sbb=new StringBuilder();
      String sbb="";
      int l=sb.length();
      
      for(int i=l-1;i>=0;i--)
        sbb+=sb.charAt(i);
      if(sbb.equalsIgnoreCase(sb))
        System.out.print("Yes ");
      else
        System.out.print("No");
      
    } 
}