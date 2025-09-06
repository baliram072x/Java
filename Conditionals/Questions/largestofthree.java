import java.util.Scanner;

public  class largestofthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter A : ");
        int a = sc.nextInt();

        System.out.println(" enter B : ");
        int b = sc.nextInt();

        System.out.println(" enter C : ");
        int c = sc.nextInt();

        if(a>=b && a>= c){
            System.out.println(a + " is bigger");
        }
        else if (b>= c && b>= a) {
            System.out.println(b + " is bigger");
        }
        else {
            System.out.println(c + " is bigger");
        }
    }
}