package castom_array;
import java.util.Scanner;

public class ArrayAction extends ArrayEntity {
    public void Set_ms() {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<LENGTH;i++) {
            ms[i]=in.nextInt();
        }
    }

    public void Get_ms() {
        System.out.print("Your Array:");
        for(int i=0;i<LENGTH;i++)
        System.out.print(ms[i]+" ");
        System.out.println("");
    }

    public void Find_max() {
        int max=ms[0];
        for(int i=1;i<LENGTH;i++) {
            if(max<ms[i]) {
                max=ms[i];
            }
        }
        System.out.println("Max element:"+max);
    }

    public void Find_central() {
        if(LENGTH % 2!=0) {
            System.out.println("Central element:"+ms[LENGTH/2]);
        }
        else {
            System.out.println("there are no central elements");
        }
    }

    public void Find_summ() {
        int summ=0;
        for(int i=0;i<LENGTH;i++) {
            summ+=ms[i];
        }
        System.out.println("Sum of Array:"+summ);
    }

    public void Positive_Neganive_Elements() {
        System.out.print("Positive:");
        for(int i=0;i<LENGTH;i++) {
            if(ms[i]>=0) {
                System.out.print(ms[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("Negative:");
        for(int i=0;i<LENGTH;i++) {
            if(ms[i]<0) {
                System.out.print(ms[i]+" ");
            }
        }
    }

    public void Eddit_ms() {
        int ind=LENGTH-1;
        int[] temp_ms= new int[LENGTH];
        for(int i=0;i<LENGTH;i++) {
            temp_ms[ind]=ms[i];
            ind--;
        }
        for(int i=0;i<LENGTH;i++) {
            ms[i]=temp_ms[i];
        }
        System.out.println("Array was reverced");
    }
}
