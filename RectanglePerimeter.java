
import java.util.*;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }
    //get user input from console
    public void getValues() {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter length and breadth of the rectangle:");
        double length = input.nextDouble();
        double breadth = input.nextDouble();
        System.out.println(perimeterCalculator(length,breadth));
    }
    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        return 2*(length+breadth);
    }
}

