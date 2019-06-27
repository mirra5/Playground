import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int key=sc.nextInt();
    char a[]=s.toCharArray();
    int count;
   if(key==7)
     System.out.print("All is well");
    else
      System.out.print("I am waiting");
    
  }
}