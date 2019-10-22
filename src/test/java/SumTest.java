import org.junit.Assert;
import org.junit.Test;


public class SumTest {


    @Test
    public void testPairs() {
        int[] arr = {5, 8, 4, 78, 12, 14, 13, 4, 9, 54, 23, 5, 1, 7, 8, 2, 6, 54, 12, 26, 10, 5 };
        int sum = 15;
        Sum sumFunction = new Sum(arr, sum);
        String expected = "[[1, 14], [2, 13], [5, 10], [6, 9], [7, 8]]";
        String actual = sumFunction.returnPairs().toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNoPairs() {
        int[] arr = {1};
        int sum = 15;
        Sum sumFunction = new Sum(arr, sum);
        String expected = "[]";
        String actual = sumFunction.returnPairs().toString();
        Assert.assertEquals(expected, actual);
    }
}
