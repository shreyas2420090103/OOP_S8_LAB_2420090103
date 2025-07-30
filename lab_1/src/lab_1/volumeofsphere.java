package lab_1;

import java.util.Scanner;

public class volumeofsphere {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter radius:\t");
    int r=sc.nextInt();
    double volume = (4.0/3)*Math.PI*r*r*r;
    System.out.println("Volume of sphere is: " +volume);
  }

}