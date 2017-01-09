/**
 * These calls should run without an exception.
 * Extend the main method with two additional shapes of your choice.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape c1 = new Circle(/* add parameters here*/);
        Shape r1 = new Rectangle(/* add parameters here*/);
        Shape s1 = new Square(/* add parameters here*/);
        Shape t1 = new Triangle(/* add parameters here*/);
        Shape r2 = s1;

        Shape[] shapes = {c1, r1, s1, t1, r2};
        for (Shape shape: shapes) {
            System.out.println("The circumference of shape " + shape.getClass().getName() + " is " + shape.circumference());
            System.out.println("The area of shape " + shape.getClass().getName() + " is " + shape.area());
        }

        // Casting (bonus task)
        // ignore the following lines, unless you have completed all other tasks
        // try to understand what is going on here
        // you can ask questions about casting any time ;)
        Rectangle r3 = (Rectangle) r1;
        System.out.println("The rectangle has an area of " + r3.area());
    }
}
