import java.util.Scanner;

public class Q6PointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the circle radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the point coordinates x and y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
        } else {
            double distance = Math.sqrt(x * x + y * y);
            double difference = Math.abs(distance - radius);

            if (difference < 1.0e-10) {
                System.out.println("The point is on the circle.");
            } else if (distance < radius) {
                System.out.println("The point is inside the circle.");
            } else {
                System.out.println("The point is outside the circle.");
            }
        }

        input.close();
    }
}
