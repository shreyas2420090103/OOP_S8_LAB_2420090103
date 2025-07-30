package lab2;

public class GCD_two_nos {
    public static int findGCD(int a, int b) {
    while (b != 0) {
    int temp = b;
    b = a % b;
    a = temp;
      }
        return a;
   }
    public static void main(String[] args) {
    int num1 = 24, num2 = 12;
    int gcd = findGCD(num1, num2);
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
