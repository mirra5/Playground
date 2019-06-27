import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int mat[][]=new int[row][col];
    int s[][]=new int[col][row];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        mat[i][j]=sc.nextInt();
      }}
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        s[j][i]=mat[i][j];
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(s[i][j]+" ");
      }
      System.out.println();
    }
  }
}