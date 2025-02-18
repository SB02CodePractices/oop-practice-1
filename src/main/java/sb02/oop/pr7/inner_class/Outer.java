package sb02.oop.pr7.inner_class;

public class Outer {
    private int instanceValue;

    public Outer(int value) {
        this.instanceValue = value;
    }

    public class Inner {
        public void printInstanceValue() {
            System.out.println("Outer instanceValue: " + instanceValue);
        }
    }
}
