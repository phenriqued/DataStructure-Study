package MainApplication;

import MainApplication.BubbleSort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[10];
        Integer[] otherArray = new Integer[10];

        for(int i=0; i<myArray.length;i++){
            myArray[i] = (int) (Math.random()*10);
            otherArray[i] = (int) (Math.random()*10);
            System.out.print(myArray[i] + " - ");
        }

        System.out.println("");
        BubbleSort.bubbleSort(myArray);

        for (Integer x: myArray) {
            System.out.print(x+ " - ");
        }
    }
}