
import org.junit.Test;
import static  org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.*;
public class DivisionTest {

@Test
    public  void testResultWithValidNum(){
        Division div = new Division();

      assertEquals( 5 ,div.result(10,2),0);

    }
    @Test
    public  void testResultWithNumAs0(){
        Division div = new Division();

        assertEquals( 0 ,div.result(0,2),0);

    }
    @Test
    public  void testResultWithNum2As0(){
        final Division div = new Division();
       assertThrows(IllegalArgumentException.class,()->div.result(5,0));

    }
    @Test
    public  void test2ResultWithNum2As0(){
        final Division div = new Division();
        assertThrows(ArithmeticException.class,()->div.result(5,0),"may be exeption not match");

    }
}
