import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
   public void multiply() {
       assertEquals(4, TestRepo.testMultiply(1, 2));
   }

}
