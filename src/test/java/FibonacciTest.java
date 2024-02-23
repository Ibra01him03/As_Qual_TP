import org.example.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void fibonacciEqualZeroTest(){
        int x = Fibonacci.fibonacci(0);
        Assertions.assertEquals(0,x);
    }

    @Test
    public void fibonacciEqualOneTest(){
        int x = Fibonacci.fibonacci(1);
        Assertions.assertEquals(1,x);
    }
    @Test
    public void fibonacciSupZeroTest(){
        int x = Fibonacci.fibonacci(6);
        Assertions.assertEquals(8,x);
    }

    @Test
    public void fibonacciInfZeroTest(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Fibonacci.fibonacci(-1));
    }
}
