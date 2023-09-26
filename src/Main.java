import BinarySearch.BinarySearch;
import SequentialSearch.SequentialSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Integer[] n = new Integer[1000000];
        for(Integer i=0; i< n.length; i++){
            n[i] = i;
        }

        SequentialSearch.sequentialSearch(n, 999999);

        System.out.println("\n_________\n");

        BinarySearch.binarySearch(n, 999999);


    }
}