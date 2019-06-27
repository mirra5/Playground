import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int len=s2.length();
    int cnt=1;
     for(int i=0;i<s1.length()-len;i++)
     {
       if((s1.substring(i,i+len)).equals(s2))
          cnt++;
     }
    System.out.println(cnt);
          
         
    
  //  System.out.println(cnt);
    
  } 
}