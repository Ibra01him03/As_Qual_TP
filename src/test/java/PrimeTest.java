import org.example.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    public void primeInfDeux(){
        Boolean b = Prime.isPrime(1);
        Assertions.assertEquals(false,b);
    }



    @Test
    public void primeEqualDeux(){
        Boolean b = Prime.isPrime(2);
        Assertions.assertEquals(true,b);
    }

    @Test
    public void primeSupQuatrePrime(){
        Boolean b = Prime.isPrime(7);
        Assertions.assertEquals(true,b);
    }

    @Test
    public void primeSupQuatreNotPrime(){
        Boolean b = Prime.isPrime(8);
        Assertions.assertEquals(false,b);
    }


}
