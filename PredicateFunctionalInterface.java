

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public static List<String> findPattern(List<String> list) {
        Stream<String> s = list.stream().filter(name -> name.startsWith("I"));
        List<String> output = s.collect(Collectors.toList());
        List<String> withoutDupes = output.stream().distinct().collect(Collectors.toList());
        return withoutDupes;
    }

    public static void main (String[] args) {
        ArrayList<String> input = new ArrayList<>();
        // Since the objective of this excercise is to focus on objective programming. Scanner is not included.
        input.add("Icecream");
        input.add("Water");
        input.add("Ice");
        input.add("Gas");
        input.add("Ice");
        input.add("Java");
        //input.add("C");
        //input.add("C++");
        //input.add("Java");
        //input.add("C");
        System.out.println(input);
        System.out.println(findPattern(input));
    }



}
