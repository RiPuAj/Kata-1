import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person alfredo = new Person("Alfredo", LocalDate.of(2005, 6, 14));
        System.out.println(alfredo);
    }
}
