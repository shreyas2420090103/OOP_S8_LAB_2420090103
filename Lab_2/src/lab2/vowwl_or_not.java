package lab2;

import java.util.Scanner;

public class vowwl_or_not {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); 
        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);  
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        scanner.close();
    }
}
