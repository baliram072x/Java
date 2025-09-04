import java.util.Scanner;

public class custbill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil price; ");
        float pencil = sc.nextFloat();
        System.out.println("enter pen price: ");
        float pen = sc.nextFloat();
        System.out.println(" enter eraser price: ");
        float eraser = sc.nextFloat();

        float subtotal = pencil + pen + eraser ;
        float gst = subtotal * 18/100;
        float total = subtotal +gst;

        System.out.println("subtotal :"+subtotal);
        System.out.println( "GST(18%):" +gst);
        System.out.println("Total with GST: " + total);
    }
}