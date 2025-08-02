package lab3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
public class TimeUntilEvent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, eventDateTime);
        if (duration.isNegative()) {
            System.out.println("The event time has already passed.");
        } else {
            long totalMinutes = duration.toMinutes();
            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;
            System.out.println("Time remaining until event:");
            System.out.printf("\t%d days, %d hours, and %d minutes\n", days, hours, minutes);
        }
        scanner.close();
    }
}