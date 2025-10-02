public class selectionsort {
    public static void selectionsort(int arr[]){
        for (int i= 0; i<arr.length; i++){
           int minpos =i;
           for (int j=i; j< arr.length; j++){
               if (arr[minpos]>arr[j]){
                   minpos = j;
               }
           }
           // swap
            int temp =arr[minpos];
           arr[minpos] =arr[i];
           arr[i] =temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1,6};
        selectionsort(arr);

    }
}
