import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int z=n-i;
        for(int j=0;j<n-i;j++){  
          System.out.print(z);
          z--;
        }
        System.out.println();
      }
	}
}