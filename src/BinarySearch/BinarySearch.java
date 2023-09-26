package BinarySearch;

public class BinarySearch {


    public static void binarySearch(Integer objs[], Integer searchObj){

        long initialTime = System.currentTimeMillis();

        Integer intial = 0;
        Integer end = objs.length -1;

        while(intial <= end){
            Integer half = (intial + end)/2;
            if(searchObj.equals(objs[half])){
                System.out.println("Object found in position: " + half);
                break;
            }else if (half > searchObj){
                end = half -1;
            }else{
                intial = half+1;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Big O Notation O(n): "+ ((endTime - initialTime)) + " milliseconds");


    }



}
