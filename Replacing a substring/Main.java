import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String rep=sc.next();
      String inc=sc.next();
      s=s.replaceAll(rep,inc);
      System.out.print(s);
    }
}