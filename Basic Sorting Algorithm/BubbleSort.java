public class BubbleSort {
    public static void bubblesorting(int arr[]){
        for(int turn =0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void  main(String[] args){
       int arr[] = {5,4,3,2,7,9,55};
       bubblesorting(arr);
       printarr(arr);
    }
}

 /*notes :-
 large element come to th end of the array by swapping with adjacent elements


  */