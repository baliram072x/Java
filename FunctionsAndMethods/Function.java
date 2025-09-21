import java.util.Scanner;

public class Function {
//    public static void printHelloWorld() {
//        System.out.println("hello world");
//        System.out.println("hello world");
//        System.out.println("hello world");
//        return;
//    }
    public static int calculateSum(int a , int b){ // parameter or formal parameter
        int sum = a + b;
        System.out.println("sum is :" + sum);

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum  = calculateSum(a,b); // arguments or actuall parameter
        System.out.println(sum);

    }
}

// two types of parameter
// 1. formal parameters --- >  normal parameter ---> writes in function defination
// 2, actual parameter --- > arguments ---> comes when function calls


/* returnType name (){
body
return statement;
 */

/* what happens in memory?


 */


