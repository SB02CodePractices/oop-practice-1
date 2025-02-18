package sb02.oop.pr7.inner_class;

public class Main {
    public static void main(String[] args) {
        Outer outer1 = new Outer(10);
        Outer.Inner outer1_inner = outer1.new Inner();
        outer1_inner.printInstanceValue();

        Outer outer2 = new Outer(-100);
        Outer.Inner outer2_inner = outer2.new Inner();
        outer2_inner.printInstanceValue();
    }
}
