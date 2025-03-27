import java.awt.Rectangle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeManager {
    private Scanner scan = new Scanner(System.in);

    private int getValidInteger(String prompt){
        while(true){
            System.out.println(prompt);
            try{
                return scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                scan.next();
            }
        }
    }

    private double getvalidDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scan.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input");
                scan.next();


            }
        }
    }
        private ShapeActions CreateShape(int choice){
            ShapeActions shape = null;
            try {
                switch (choice) {
                    case (1):
                        double radius = getvalidDouble("Enter radius:");
                        shape = new Circle(radius);
                        break;
                    case (2):
                        double length = getvalidDouble("Enter your length:");
                        double breadth = getvalidDouble("Enter your breadth:");
                        shape = new rectangle(length, breadth);
                        break;
                    case (3):
                        double side = getvalidDouble("Enter the length of your side:");
                        shape = new Square(side);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please enter a valid number");
                scan.next();
            }
            return shape;
        }


    public void startapp() {
        while (true) {
            int descision = getValidInteger("Shape manager\nchoose shape to create:\n >Circle \n >Rectangle \n >Square \n >Quit \n");
            if (descision == 4) {
                System.out.println("Thank you for using this service");
                break;
            }
            ShapeActions shape = CreateShape(descision);
            if (shape == null)
                continue;

            while (true) {
                int action = getValidInteger(" Choose an action:\n1. Calculate Area \n2. Calculate perimeter \n3.View description \n4. Go back to the menu");
                switch (action) {
                    case (1):
                        System.out.print("Area: " + shape.CalculateArea());
                        System.out.println();
                        break;
                    case (2):
                        System.out.print("Perimeter: " + shape.CalculatePerimeter());
                        System.out.println();
                        break;
                    case (3):
                        System.out.println(shape.GetDescription());
                        System.out.println();
                        break;
                    case (4):
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                if (action == 4) break;
            }
        }

    }
}
