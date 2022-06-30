
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class NumberAverage {
    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }
    //get the values of the array from the user
    public void getArrayValues() {
        Scanner scan = new Scanner(System.in);
        //     System.out.println("Enter number of values:");
        int size = scan.nextInt();
        int[] inputArray = new int[size];
        //   System.out.println("Enter the values:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(findAverage(inputArray));
    }
    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {

        int result = 0;
        if (inputArray.length != 0) {
            for (int value : inputArray) {
                if (value > 0)
                    result += value;
                else
                    return "Give proper positive integer values";
            }
            return "The average value is: " + result / inputArray.length;
        } else
            return "Empty array";
    }
}