package main;
import castom_array.ArrayAction;
import stream.EntityArrayStream;
import stream.FindArrayStream;
import stream.SortArrayStream;

import java.util.stream.IntStream;

public class main_prog extends ArrayAction {
    public static void main(String[] args) {
        int[] ms={1,2,6,4,5};
        FindArrayStream find=new FindArrayStream();
        System.out.println(find.FindMax(ms));
        System.out.println(find.FindMin(ms));
        System.out.println(find.FindSumm(ms));
    }
}
