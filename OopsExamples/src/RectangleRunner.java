public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0, 3.5);
        System.out.println(rectangle);
        System.out.println("Area of Rectangle: "+ rectangle.area());
        System.out.println("Perimeter of Rectangle: "+ rectangle.perimeter());
    }
}
