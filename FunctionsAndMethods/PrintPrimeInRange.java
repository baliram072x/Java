public class PrintPrimeInRange {
    public static boolean isprime(int n){
        // cornor cases
        if(n == 2){
            return true;
        }
        boolean isprime = true;
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void primesinrange(int n){
        for(int i = 2; i<= n; i++){
            if(isprime(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        primesinrange(100);
    }
}
