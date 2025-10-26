public class CheakevenOrOdd {
    public static void oddoreven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0 ){
            // even number
            System.out.println("even number ");
        } else {
            // odd number
            System.out.println("odd number");
        }
    }
    public static void main(String[] args){
        oddoreven(3);
        oddoreven(11);
        oddoreven(14);

    }
}
