import java.util.Scanner;
import java.util.*;

public class StringFinder {
    //Create Scanner object as instance variable
    private Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user

        StringFinder finder = new StringFinder();

        String searchString = finder.getInput();
        String firstString = finder.getInput();
        String secondString = finder.getInput();
        int result = finder.findString(searchString, firstString, secondString);
        finder.displayResult(result);
        finder.closeScanner();
    }
    public String getInput() {

        return reader.nextLine();
    }
    public void displayResult(int result) {
        //displays the result
        switch(result) {
            case 1:
                System.out.println("Found as expected");
                break;
            case 0:
                System.out.println("Not found");
                break;
            default:
                System.out.println("Empty string or null");
                break;
        }
    }
    public int findString(String searchString, String firstString, String secondString) {
        if(searchString!=null&&firstString!=null) {
            searchString = searchString.replaceAll("\"", "");
            firstString = firstString.replaceAll("\"", "");
            secondString = secondString.replaceAll("\"", "");
        }
        if(searchString!=null&&firstString!=null) {
            if (!searchString.isBlank() && !firstString.isBlank() && !secondString.isBlank())
            {
                if (searchString.contains(firstString) && searchString.contains(secondString)) {
                    //checks whether secondString comes after firstString in searchString
                    if (searchString.indexOf(firstString) < searchString.indexOf(secondString)) {
                        return 1;
                    }


                }
                return 0;
            }
        }
        return -1;

    }
    public void closeScanner() {
        reader.close();
    }
}