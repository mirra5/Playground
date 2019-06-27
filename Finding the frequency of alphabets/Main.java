import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int a[]=new int[26];
      s=s.toLowerCase();
      int offset;
      for(int i=0;i<s.length();i++)
      {
        offset=s.charAt(i)-'a';
        a[offset]++;
      }
      int count[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        offset=s.charAt(i)-'a';
        if(count[offset]==0)
        {
        System.out.print((s.charAt(i)));
        System.out.print(a[offset]+" ");
          count[offset]++;
        }
      }
      
    }
}