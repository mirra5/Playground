import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int [][] a=new int[row][col];
    int [][] b=new int[row][col];
    int sub;
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        b[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        sub=a[i][j]-b[i][j];
        System.out.print(sub+" ");
      }
    System.out.println();
  }}
}