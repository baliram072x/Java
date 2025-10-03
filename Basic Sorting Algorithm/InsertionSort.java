public class InsertionSort {

    public static void insertion(int arr[]){
        for(int i = 1; i< arr.length; i++){
            int curr = arr[i]; // jo element abhi insert karna hai
            int prev =i-1; // uske pehle wala index
            // finding out correct position to insert
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev]; // badi value ko ek step aage shift karo
                prev--;                  // ek step aur piche jao
            }
            arr[prev+1] = curr;          // curr ko apni sahi jagah pr insert karo
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {9,7,8,5,6,1,3,2};
        insertion(arr);
        printarr(arr);

    }
}

