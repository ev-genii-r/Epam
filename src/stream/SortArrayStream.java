package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArrayStream {
   public int[] SortArray(int[] Array){
       IntStream Arr=IntStream.of(Array);
       return  Array=Arr.sorted().toArray();
   }
}
