package castom_array;

public class ArraySort {
    public int[] SelectionSort(int[] ms){
        int temp;
        for(int i=0;i<ms.length-1;i++){
            for (int j=i;j<ms.length;j++) {
                if(ms[j]<ms[i]){
                    temp=ms[i];
                    ms[i]=ms[j];
                    ms[j]=temp;
                }
            }
        }
        return ms;
    }

    public int[] BubbleSort(int[] ms){
        int temp;
        int ind=ms.length;
        while(ind!=0)
        {
            for(int i=1;i<ind;i++)
            {
                if(ms[i]<ms[i-1]){
                    temp=ms[i];
                    ms[i]=ms[i-1];
                    ms[i-1]=temp;
                }
            }
            ind--;
        }
        return ms;
    }

    public int[] IsnertionSort(int[] ms) {
        for (int j = 0; j < ms.length; j++) {
            int value = ms[j];
            int i = j - 1;
            for (; i >= 0; i--) {
                if (value < ms[i]) {
                    ms[i + 1] = ms[i];
                } else {
                    break;
                }
            }
            ms[i + 1] = value;
        }
        return ms;
    }
}
