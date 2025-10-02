public class EvenOrOddSelectionSort {
    public static void evenorodd(int arr[]){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] +" even");
            }else{
                System.out.println(arr[i] + " odd");
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        evenorodd(arr);
    }
}


//
//
//for (int i= 0; i<arr.length; i++){
//int minpos =i;
//           for (int j=i+1; j< arr.length; j++){
//        if (arr[minpos]< arr[j]){
//minpos = j;
//               }
//                       }
//// swap
//int temp =arr[minpos];
//arr[minpos] =arr[i];
//arr[i] =temp;
//        }
//                for(int i=0; i<arr.length; i++) {
//        System.out.println(arr[i] + " ");
//        }
//                }
//public static void main(String[] args){
//    int arr[] = {5,4,3,2,1,6};
//    selectionsort(arr);
//
//}
