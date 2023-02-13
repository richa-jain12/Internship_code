import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args){
        LocalDateTime obj1 = LocalDateTime.now();
        System.out.println("Before Formatting: " + obj1);

        DateTimeFormatter obj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String formatted = obj1.format(obj2);
        System.out.println("After Formatting: " + formatted);
    }
}
