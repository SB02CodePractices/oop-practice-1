package sb02.oop.pr5.ex1;

public class LspTest {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);

        System.out.println("Rectangle area: " + rect.getArea());

        Rectangle rect2 = new Square();
        rect2.setWidth(5);
        rect2.setHeight(10);

        System.out.println("Rect 2 area: " + rect2.getArea());
    }
}
