import java.util.Arrays; // inbuld package for inbuild sort
import java.util.Collection;
import java.util.Collections;


public class InbuildSort {
    public static void printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

        public static void main (String[]args){
            Integer arr[] = {5,4,1,3,2};
            Arrays.sort(arr, Collections.reverseOrder());
            printarr(arr);

        }
    }

