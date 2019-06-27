import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int z=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=0;j<n-i;j++)
          System.out.print(" ");
        for(int k=1;k<=i;k++){
          System.out.print(z+" ");
          z++;
        }
        System.out.println();
      }
    }    
}