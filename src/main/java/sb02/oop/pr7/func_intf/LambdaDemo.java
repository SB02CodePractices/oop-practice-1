package sb02.oop.pr7.func_intf;

public class LambdaDemo {

    public static void main(String[] args) {

        MyCalculator addCalculator = new AddCalculator();
        System.out.println(addCalculator.operate(5, 10));

        MyCalculator addAnonymous = new MyCalculator() {
            @Override
            public int operate(int x, int y) {
                return x + y;
            }
        };
        System.out.println("익명 클래스: 3 + 5 = " + addAnonymous.operate(3, 5));

        final int factor = 11; // effectively final

        MyCalculator addLambda = (a, b) -> {
            int c = a * factor;
            return c + b;
        };
        System.out.println("람다 연산 결과: " + addLambda.operate(3, 5));
    }
}
