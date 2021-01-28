package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
public class EntityArrayStream {
    IntStream ArrayStream;
    public EntityArrayStream(IntStream TempArray) {
        ArrayStream = TempArray;
    }

    public IntStream getArrayStream(){

        return ArrayStream;
    }

    public void setArratStream(IntStream TempArray){
        ArrayStream = TempArray;
    }
    public int[] getStreamInFormOfInt(){
        return ArrayStream.toArray();
    }
}
