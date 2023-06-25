import java.util.Scanner;

public class RectangleInfo
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        while (width <= 0 || height <= 0)
        {
            System.out.println("The width and height must be positive numbers.");
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextInt();
            System.out.print("Enter the height of the rectangle: ");
            height = scanner.nextInt();
        }

        int area = width * height;
        int perimeter = 2 * (width + height);

        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The length of the diagonal is " + diagonal);
    }
}
