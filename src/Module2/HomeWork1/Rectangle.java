package Module2.HomeWork1;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
        System.out.println("Создан прямоугольник с сторонами " + width + " x " + length);
    }

    public Rectangle() {
        this.width = 30;
        this.length = 15;
        System.out.println("Создан прямоугольник с сторонами 30 х 15");
    }

    public void square(int width, int length) {
        int square = width * length;
        System.out.println("Площадь прямоугольника = " + square);
    }

    public void perimeter(int width, int length) {
        int perimeter = (width + length) * 2;
        System.out.println("Периметр прямоугольника = " + perimeter);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
