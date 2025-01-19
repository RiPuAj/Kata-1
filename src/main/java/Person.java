import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return (int) (LocalDate.now().toEpochDay() - birthDate.toEpochDay()) / 365;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                "age=" + getAge() +'}';
    }
}
