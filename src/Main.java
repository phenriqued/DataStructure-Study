import SequentialSearch.SequentialSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Integer[] n = new Integer[1000];
        for(Integer i=0; i< n.length; i++){
            n[i] = (int) (Math.random() * 1000);
        }
        n[999] = 5001;

        SequentialSearch.sequentialSearch(n, 5001);


    }
}