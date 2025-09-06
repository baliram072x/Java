import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a:");
        int a = sc.nextInt();
        System.out.println(" enter b:");
        int b = sc.nextInt();
        System.out.println("enter oprator :");
        char oprator = sc.next().charAt(0);

        switch (oprator){
            case '+' :
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
            default:
                System.out.println("teri maa ki chut sahi number dal");

        }
    }
}