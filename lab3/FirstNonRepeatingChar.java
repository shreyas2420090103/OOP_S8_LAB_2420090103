package lab3;
import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
    String input = "swiss";
    char result = findFirstNonRepeatingChar(input);
    if (result != 0) {
          System.out.println(result);
        } else {
          System.out.println("No non-repeating character found.");
        }
    }
    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
        charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0; 
    }
}