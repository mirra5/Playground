import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        a[i]=sc.nextInt();
      int large=0;
      for(int i=0;i<size;i++)
      {
        if(a[i]>large)
          large=a[i];
      }
      System.out.println(large);
    }
}