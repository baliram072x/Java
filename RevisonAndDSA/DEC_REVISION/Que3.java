
import java.util.Scanner;

public class Que3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int number;
        int even = 0;
        int odd = 0;

        do {
            System.out.println("enter the number : ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                even += number;

            } else {
                odd += number;
            }
            System.out.println("do u wants to continue enter 1 and if not enter 0");
            choice = sc.nextInt();
        }
        while (choice != 1);
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);

    }

}
