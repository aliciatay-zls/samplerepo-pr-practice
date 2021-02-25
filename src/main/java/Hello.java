import java.time.LocalDate;

public class Hello {
    public static LocalDate getDate() {
        LocalDate today = LocalDate.now();
        return today;
    }

    public static void main(String[] args) {
        System.out.println("Date: " + getDate());
        System.out.println("Message: hello world");
    }
}
