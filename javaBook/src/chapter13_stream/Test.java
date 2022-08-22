package chapter13_stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(a -> System.out.println());
        int reduceUse = Arrays.stream(arr).reduce(0, (a,b)->a+b);
        System.out.println(reduceUse);

        ArrayList<String> sList = new ArrayList<>();
        sList.add("hello");
        sList.add("hello java");
        sList.add("hell");
        sList.add("he");
        sList.add("h");

    }
}
