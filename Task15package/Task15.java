package Task15package;
public class Task15 {
    
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);

        System.out.println("Circle:");
        System.out.printf("Area: %.2f\n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
    }
}
