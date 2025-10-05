/*
Q1..Convert a double value 12.56 into an int and print it.

Q2.. Read a String containing a number like "123" and convert it to an integer, then add 10 to it and print.
 */

public class TypeCastingConversion {
    public static void main(String[] args){
        double a = 12.56;
//        int b = (int) (a);
        int b = (int) Math.round(a);
        // type casting doesnt roundup double value if you wamts to round up then use Math.round()
        System.out.println(b);

        String num = "123";
        int number = Integer.valueOf(num); // this converts string into int
        System.out.println(number+10);
    }
}
