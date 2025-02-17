package sb02.oop.pr5.ex2;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("height must be > 0");
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
