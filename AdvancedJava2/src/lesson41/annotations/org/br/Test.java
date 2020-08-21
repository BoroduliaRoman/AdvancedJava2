package lesson41.annotations.org.br;

/**
 * @author BR
 */

public class Test {
    @MethodInfo(purpose = "Print Hello World!")
    public void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
