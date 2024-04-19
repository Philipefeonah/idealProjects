public class Rectangle extends MyShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height);
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "\nWidth :" + width +
                "\nHeight :" + height +
                "\nArea : " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
