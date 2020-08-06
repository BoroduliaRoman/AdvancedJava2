package lesson33.lambda.org.br;

/**
 * @author BR
 */

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

/*
class ExecutableImplementation implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}
*/

public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();

        int a = 1;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                int a = 2;
                return x + y;
            }
        });

//        int a = 1;

        runner.run((x, y) -> x + y);
    }
}
