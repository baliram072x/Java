
public class problem11 {

    public static void printindex(int arr[], int idx, int key) {
        // base case 
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == key) {
            System.out.println(idx + " ");
        }

        // recursive call 
        printindex(arr, idx + 1, key);

    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printindex(arr, 0, key);
    }
}
