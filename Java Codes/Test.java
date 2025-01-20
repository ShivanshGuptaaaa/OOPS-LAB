import java.util.Scanner;
class Test {
  int number;

  public static void main(String []a)
  {
    int number;

    Scanner sc = new Scanner(System.in);
    System.out.print("enter a value ");
    number = sc.nextInt();

    System.out.println("default value is" + number); 
  }
  
}