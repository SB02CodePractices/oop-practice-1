package sb02.oop.pr7.static_nested_class;

public class Outer {
    private static int staticValue = 100;
    private int instanceValue = 200;

    public static class StaticNested {
        public void printValues() {
            System.out.println("Outer.staticValue: " + staticValue);
//            System.out.println(instanceValue);
        }
    }
}
