
//
//public class problem5 {
//    public static int firstoccurance(int arr[] , int key , int i ){
//        if (i == arr.length){
//            System.out.println("Error..Number not Found !!");
//            return 0;
//        }
//        if (arr[i] == key){
//            return i;
//        }
//        return firstoccurance(arr, key ,i+1);
//    }
//    public static void main(String[] args){
//         int arr[] = {8,3,6,9,5,18,2,5,3};
//        System.out.println(firstoccurance(arr, 10, 0 ));
//    }
//}

// first occurance in array


public class problem5 {
    public static int lastoccurance(int arr[] , int key , int i ){
        int isfound = lastoccurance(arr , key , i+1);
        if (isfound != -1){
            return isfound;
        }
        // cheak with self
        if (arr[i] == key){
            return i ;
        }
    }
    public static void main(String[] args){
        int arr[] = {8,3,6,9,5,18,2,5,3};
        System.out.println(lastoccurance(arr, 10, 0 ));
    }
}


// last occurence in array

