import org.joda.time.DateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentRegistrationSystemDriverTest {
    private final String name = "Marvin";
    private final int age = 21;
    private final DateTime DOB = DateTime.now();
    private final int ID = 1234;

    private final Student student = new Student(name, age, DOB, ID);

    // test that jitpack is working correctly
    @Test
    @DisplayName("Get correct user name")
    public void getUserNameTest() {
        assertEquals("Marvin21", student.getUserName());
    }
}
