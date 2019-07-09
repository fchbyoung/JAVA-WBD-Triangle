import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1 = ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the side2 = ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the side3 = ");
        double side3 = scanner.nextDouble();

        while (!Triangle.isTriangle(side1, side2, side3)) {
            System.out.println("Invalid input edge length, please re-enter");
            System.out.println("Enter the side1 = ");
            side1 = scanner.nextDouble();
            System.out.println("Enter the side2 = ");
            side2 = scanner.nextDouble();
            System.out.println("Enter the side3 = ");
            side3 = scanner.nextDouble();
        }

        Shape triangle1 = new Triangle(side1, side2, side3);
        System.out.println(triangle1);

        Shape triangle2 = new Triangle("Red", true, side1, side2, side3);
        System.out.println(triangle2);
    }
}
