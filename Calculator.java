

import java.util.*;

public class Calculator {

    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        String decision=null;
        do{ //starts loop
            scan = new Scanner(System.in);
            new Calculator().getValues(scan);
            //everything you're trying to do during the loop goes here
            System.out.println("Do you want to try again(y/n)");

            decision = scan.next(); //input will reference your scanner variable and puts answer into the variable we made
        }while(decision.equalsIgnoreCase("y"));
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        //   Scanner input = new Scanner(System.in);
        //    System.out.println("Enter the first number:");
        int firstValue = scan.nextInt();
        //  System.out.println("Enter the second number:");
        int secondValue = scan.nextInt();
        //System.out.println("1. Add ");
        //System.out.println("2. Subtract");
        //System.out.println("3. Multiply");
        //System.out.println("4. Divide");
        int operator = scan.nextInt();
        String result = calculate(firstValue,secondValue,operator);
        System.out.println(result);
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        String result;
        String text;

        switch (operator) {
            case 1:
                result = firstValue +" + "+ secondValue+ " = " + (firstValue + secondValue);

                break;
            case 2:
                result = firstValue +" - "+ secondValue+ " = " + (firstValue - secondValue);

                break;
            case 3:
                result = firstValue +" * "+ secondValue+ " = " + (firstValue * secondValue);
                break;
            case 4:
                if (secondValue == 0) {
                    result = "The divider (secondValue) cannot be zero";
                    break;
                }
                result = firstValue + " / " + secondValue + " = " + (firstValue / secondValue);
                break;

            default:
                result = "Entered wrong option "+operator;

        }

        return result;
    }
}
