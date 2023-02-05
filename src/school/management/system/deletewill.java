package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class deletewill {
    public static void main(String[] args){

        // new type of object containing multiple numbers.
        //count of numbers in array => is defined
        //automatically allocated as need => Arraylist -> is not defined -> can allocate memory dynamically

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(15);
        numbers.add(51);
        numbers.add(20);

        System.out.println(numbers);
    }
}
