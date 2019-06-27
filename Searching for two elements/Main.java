import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int aa[]=new int[size];
      for(int i=0;i<size;i++)
        aa[i]=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int f=0;
      for(int i=0;i<size;i++)
      {
        if(aa[i]==a){
          System.out.println(i);
          f=1;
          break;
        }
      }
      if(f==0)
        System.out.println("-1");
      f=0;
      for(int i=0;i<size;i++)
      {
        if(aa[i]==b){
          System.out.println(i);
          f=1;
          break;
        }
      }
      if(f==0)
        System.out.println("-1");
        
      
    }
}