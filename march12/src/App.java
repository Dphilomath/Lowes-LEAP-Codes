public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = (length, breadth) -> {
            System.out.println("Area of Rectangle: " + (length * breadth));
        };
        rectangle.area(10, 20);
        SimpleInterest si = (p, t, r) -> {
            System.out.println("Simple Interest: " + ((p * t * r) / 100));
        };
        si.simpleInterest(1000, 2, 5);
        Circle circle = (radius) -> {
            System.out.println("Area of Circle: " + (3.14 * radius * radius));
        };
        circle.area(10);
    }
}
