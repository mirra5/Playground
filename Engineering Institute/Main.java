//import required packages
import java.util.*;
class Faculty
{
  int sal;
  public void salary()
  {
    //write your Faculty class statements
   
  }
}
class CSE extends Faculty
{
int sal1;
  public void salary()
  {
    //write your CSE class statements
   
  }
}
class IT extends Faculty
{
int sal2;
  public void salary()
  {
  sal2=sal+5000;
  System.out.println("IT Faculty: "+sal2);
    //write your IT class statements
  }
}
class ECE extends Faculty
{
int sal3;
  public void salary()
  {
    //write your ECE class statements
    sal3=sal+4000;
    System.out.println("ECE Faculty: "+sal3);
  }
}

class Main
{
  public static void main(String[] args)
  {
    
    //implement your required concept here
    Scanner sc=new Scanner(System.in);
    int sal=sc.nextInt();
    if(sal>0)
    {
      System.out.println("Base Salary: "+sal);
      System.out.println("CSE Faculty: "+(sal+3000));
      System.out.println("IT Faculty: "+(sal+5000));
      System.out.println("ECE Faculty: "+(sal+4500));
                         
    }
    else
      System.out.println("null");
    
      
  }
}