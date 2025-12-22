
public class problem9 {

    public static int friendsparing(int n) {
// basae case

        if (n == 1 || n == 2) {
            return n;
        }
        // // choise
        // //single 
        // int fnm1 = friendsparing(n - 1);

        // //pair
        // int fnm2 = friendsparing(n - 2);
        // int pairways = (n - 1) * fnm2;

        // //  total ways 
        // int totways = fnm1 + pairways;
        // return totways;

        return friendsparing(n-1) + (n-1)*friendsparing(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(friendsparing(3));

    }
}


/*
friends Paring problem 

Given n friends each one can remain single or can be paired up with some other friends 
each friend can be paired only once find out the total number of ways in which friends can remain 
single or can be paired up
 */
