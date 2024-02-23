import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.invoke.TypeDescriptor;

public class FactorialTest {
    @Test
    public void factorialInfZeroTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> Factorial.factorial(-1));
    }
    @Test
    public void factorialSupZeroTest(){
        Assertions.assertEquals(120,Factorial.factorial(5));
    }


    @Test
    public void factorialOneTest(){
        Assertions.assertEquals(1,Factorial.factorial(1));
    }
    @Test
    public void factorialZeroTest(){
        Assertions.assertEquals(1,Factorial.factorial(0));
    }


}
