
//public class LinearSearch {
//    public static int Linearsearch(int numbers[] , int key){
//        for (int i =0; i<numbers.length; i++){
//            if(numbers[i]== key){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args){
//        int numbers[] = {2,4,6,8,10,12,14,16};
//        int key =10;
//        int index = Linearsearch(numbers ,key);
//        if(index == -1){
//            System.out.println("not found");
//        }else {
//
//            System.out.println("key is at index : " + index);
//        }
//    }


import java.util.Scanner;

public class LinearSearch {
    public static int menucard(String menu[] , String key){
        for( int i = 0; i< menu.length; i++){
            if ( menu[i] .equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"idli", "dosa", "samosa", "jalebi", "ice-cream", "khichdi", "sambar", "rice"};
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        int index = menucard(menu, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println(" your dish is at : " + index);
        }
    }
}
