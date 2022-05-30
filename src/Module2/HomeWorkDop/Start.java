package Module2.HomeWorkDop;

public class Start {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.perimeter(rectangle.getWidth(), rectangle.getLength());
        rectangle.square(rectangle.getWidth(), rectangle.getLength());
        Rectangle rectangle1 = new Rectangle(5, 3);
        rectangle1.perimeter(rectangle1.getWidth(), rectangle1.getLength());
        rectangle1.square(rectangle1.getWidth(), rectangle1.getLength());
    }
}
