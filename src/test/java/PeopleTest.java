import org.junit.Test;
import static org.junit.Assert.*;

public class PeopleTest {
    People Jonh = new People("Doe", "Jonh", 24);

    @Test
    public void getBirthYear() {
        int newAge = 21;
        Jonh.setAge(newAge);

        int expectedYear = 2017 - newAge;
        assertEquals(expectedYear, Jonh.getBirthYear());
    }

    @Test
    public void getOlder() {

        int age = Jonh.getAge();
        int supplYear = 30;

        int expectedAge = age + supplYear ;
        assertEquals(expectedAge, Jonh.getOlder(supplYear));
    }

}