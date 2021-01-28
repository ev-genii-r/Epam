package stream;

import java.util.stream.IntStream;

public class FindArrayStream {
    public int FindMin(int[] tempArray){
        IntStream Array=IntStream.of(tempArray);
        return Array.min().getAsInt();
    }
    public int FindMax(int[] tempArray){
        IntStream Array=IntStream.of(tempArray);
        return Array.max().getAsInt();
    }
    public int FindSumm(int[] tempArray){
        IntStream Array=IntStream.of(tempArray);
        return Array.sum();
    }
}
