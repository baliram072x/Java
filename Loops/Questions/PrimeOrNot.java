package Questions;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break; // optimization: ek factor mila toh aage check karne ki zarurat nahi
            }
        }

        if (isprime && n > 1) {
            System.out.println("is prime");
        } else {
            System.out.println("is not prime");
        }
    }
}

