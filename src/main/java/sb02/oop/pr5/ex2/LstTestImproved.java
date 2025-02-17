package sb02.oop.pr5.ex2;

public class LstTestImproved {

    public static void main(String[] args) {
        Shape rect = new Rectangle(2, 3);
        System.out.println("Rectangle area: " + rect.getArea());

        Shape square = new Square(4);
        System.out.println("Square area: " + square.getArea());
    }
}
