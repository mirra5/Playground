import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        System.out.print("*");
        if(i==0 || i==(n-1))
        for(int j=0;j<n-2;j++)
          System.out.print("*");
        else
          for(int j=0;j<n-2;j++)
            System.out.print(" ");
        System.out.print("*");
        System.out.println();
      }
        
	}
}