//public class problem6 {
//    public static int power(int x , int n){
//        if (n == 0){
//            return 1;
//        }
//      int xnm1 =  power(x, n-1);
//        int xn =x*xnm1;
//        return xn;
//    }
//    public static void main(String[] args){
//        System.out.println(power(2,10));
//    }
//}

// print x^n

// optimized code

public class problem6 {
    public static int optimizedpower(int a , int n){
        if (n == 0){
            return 1;
        }
     int halfpower =  optimizedpower(a , n/2) ;
        int halfpowersq = halfpower * halfpower;

     // n is odd
        if ( n%2 != 0){
            halfpowersq = a *halfpowersq;
        }

        return halfpowersq;
    }
    public static void main(String[] args){
int a =2;
int n =10;
        System.out.println(optimizedpower(a,n));
    }
}