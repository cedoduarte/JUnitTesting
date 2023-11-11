import com.mycompany.testingproject.UserDto;
import com.mycompany.testingproject.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {
    @Test
    public void doTest() {
        UserDto expected = new UserDto();
        expected.setId(1L);
        expected.setName("Carlos");
        
        UserService userService = new UserService();
        userService.createUser(1L, "Carlos");
        UserDto result = userService.getUser(1L);
           
        Assertions.assertEquals(expected.getName(), result.getName());
        System.out.println("test 1 finished...");
    }
    
    @Test
    public void doSecondTest() {
        UserDto expected = new UserDto();
        expected.setId(1L);
        expected.setName("Carlos");
        
        UserService userService = new UserService();
        UserDto result = userService.createUser(1L, "Carlos");
        
        Assertions.assertEquals(expected.getName(), result.getName());
        System.out.println("test 2 finished...");
    }
    
    @Test
    public void doThirdTest() {
        Assertions.assertEquals(1, 1);
        System.out.println("test 3 finished");
    }
}
