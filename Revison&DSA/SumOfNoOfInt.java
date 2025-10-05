public class SumOfNoOfInt {
    public static void main(String[] args){
        int a = 12345;

        int d1 = a % 10;
        int d2 = (a/10)%10;
        int d3 = (a/100)%10;
        int d4 = (a/1000)%10;
        int d5 = (a/10000)%10;
        int sum = d1+d2+d3+d4+d5;
        System.out.println(sum);

    }
}
