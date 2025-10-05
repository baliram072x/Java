/*
Q1..Create two int variables and one double variable. Perform addition, subtraction, multiplication, and division. Print the results.

Q2.. What happens if you divide an integer by zero? Write code to check.
 */

public class DatatypeOprations {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        double c = 10.5;
        double sum = a+b+c;
//        int sum = (int)(a + b + c);
        System.out.println(sum);

        int d = 5;
        int e = 0;

        if(e != 0){
            System.out.println(d / e);
        } else {
            System.out.println("Error: Division by zero not allowed!");
        }

    }
}
