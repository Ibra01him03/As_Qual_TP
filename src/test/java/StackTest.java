import org.example.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void pushTest() {
        Stack pile = new Stack();
        pile.push(5);
        int x = pile.peek();   //on supose que peek() bien fonctione
        Assertions.assertEquals(5, x);
    }

    @Test
    public void popTest() {
        Stack pile = new Stack();
        pile.push(6);  // push bien fonctinne selon le Test 1
        int x = pile.pop();
        Assertions.assertEquals(6, x);
    }

    @Test
    public void peekTest() {
        Stack pile = new Stack();
        pile.push(6);
        int x = pile.peek(); //on supose que peek() bien fonctione
        Assertions.assertEquals(6, x);
    }

    @Test
    public void sizeTet() {
        Stack pile = new Stack();
        pile.push(6); // push bien fonctinne selon le Test 1
        int x = pile.size(); //
        Assertions.assertEquals(1, x);
    }
}
