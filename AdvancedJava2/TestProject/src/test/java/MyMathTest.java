import org.junit.Test;

/**
 * @author BR
 */
public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        MyMath.divide(1, 0);
    }
}
