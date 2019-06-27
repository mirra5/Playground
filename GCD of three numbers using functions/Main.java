import java.util.Scanner;
class Main{
  public static int gcd(int a, int b, int c)
  {
    int min=(a<b)?((a<c)?a:c):((b<c)?b:c);
    
    while(min>=1)
    {
      if(a%min==0 && b%min==0 && c%min==0){
        min=min;
        break;
      }
      else
        min=min-1;
        
    }
    return min;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      System.out.println(gcd(a,b,c));
      
	}
}