import org.junit.Assert;
import org.junit.Test;

public class FibTest {

    @Test
    public void fib8(){
        int expected = 21;
        int actual = Fib.fib(8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fib10(){
        int expected = 55;
        int actual = Fib.fib(10);
        Assert.assertEquals(expected, actual);
    }

}
