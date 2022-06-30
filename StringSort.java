
import java.util.ArrayList;
import java.util.*;

public class StringSort {

    //write here logic to sort a string List
    public static String stringSorter(List<String> stringList, String sortingOrder) {
        int pass = 0;
        String decision="";
        String Message1;
        String Message2;
        String arrayasstring;
        List stringList2;
        //The following Lines are about delivering failure reason. If user does not
        //fill the list or if the user does not use the right asc or desc code.
        if (stringList.contains(null) || stringList.contains("")) {
            Message1="The list contains an empty or blank space value";
            pass=0;
        } else {
            Message1="";
            pass=1;
        }
        if (sortingOrder!="asc" && sortingOrder!="desc") {
            Message2 ="No sorting order present for given string 'sort' , 'asc' for ascending order sort and 'desc' for descending order sort";
        } else if (sortingOrder==""||sortingOrder==null) {
            Message2 ="Given stringList or sortingOrder is empty, null or blank space";
        } else {
            Message2 ="";
        }
        //The following Lines are about sorting the array. But also delivering back the array list
        //as string.
        if (pass==1) {
            if (sortingOrder == "asc") {
                //Order the array ascending order and print it as String.
                Collections.sort(stringList);
                decision=stringList.toString();

            } else if (sortingOrder == "desc") {
                //Order the array descending order and print it as String.
                Collections.sort(stringList, Collections.reverseOrder());
                decision=stringList.toString();
            } else {
                decision="";
            }
        }
        //The following lines are about returning the final string.

            return decision + Message2+""+Message1;
    }

    public static void main(String[] args) {
        new ArrayList<String>();
        List<String> mylist = Arrays.asList("Kennedy", "Apple","John");
        String sortingOrder = "asc";
        System.out.println(mylist+","+sortingOrder);
        stringSorter(mylist,sortingOrder);
        System.out.println(stringSorter(mylist,sortingOrder));
    }
}