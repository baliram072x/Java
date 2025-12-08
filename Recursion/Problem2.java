public class Problem2 {
    public static void increasefun(int n ){
        if (n == 1){
            System.out.println(n);
            return;
        }
        increasefun(n-1);
        System.out.println(n +" ");

    }
    public static void main(String[] args){
        int n = 10 ;
        increasefun(n);
    }
}


// print numbers from n to 1 ( increasing order)