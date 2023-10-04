package MainApplication;

import MainApplication.BubbleSort.BubbleSort;
import MainApplication.InsertionSort.InsertionSort;


public class Main {
    public static void main(String[] args) {

        Integer[] myArray = new Integer[10];

        for(int i=0; i<myArray.length;i++){
            myArray[i] = (int) (Math.random()*100);
            System.out.print(myArray[i] + " - ");
        }

        System.out.println("\nInsertion Sort");
        InsertionSort.insertionSort(myArray);

        for (Integer x: myArray) {
            System.out.print(x+ " - ");
        }
    }
}