package MainApplication;

import MainApplication.SelectionSort.SelectionSort;


public class Main {
    public static void main(String[] args) {

        Integer[] myArray = new Integer[10];

        for(int i=0; i<myArray.length;i++){
            myArray[i] = (int) (Math.random()*10);
            System.out.print(myArray[i] + " - ");
        }

        System.out.println("\nSelection Sort");
        SelectionSort.selectionSort(myArray);

        for (Integer x: myArray) {
            System.out.print(x+ " - ");
        }
    }
}