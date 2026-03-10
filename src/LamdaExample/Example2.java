package LamdaExample;

// sigle abstract method
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class Example2 {
    static void main(String[] args) {


        // using lamda expersion
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;

        System.out.println(add.operation(10, 20));
        System.out.println(sub.operation(40, 30));
    }
}
