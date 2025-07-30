import java.util.Scanner;
public class sum_of_digits {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number:\t");
      int num=sc.nextInt();
      int a=0;
      while(num>0) {
        a+=num%10;
        num=num/10;
      }
       System.out.println("Sum of digits of number is " +a);
  }

}