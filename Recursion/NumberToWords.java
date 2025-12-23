
public class NumberToWords {

    public static void main(String[] args) {
        // int n = 10;
        // printWords(n);
        // System.out.println();
        NameToNumber.number();  
        System.out.println();
         
        int[] numbers = {1, -32, 35, 33, 46, -32, 36, 47, -32, 33, 46, 57, 52, 40, 41, 46, 39, -32, 55, 40, 33, 52, 37, 50, 54, 37, 50, -32, 57, 47, 53, -32, 51, 33, 57, 51
};
        NumberToName.convert(numbers);
    }
}

class NameToNumber {

    public static void number() {
        String name = "one eight nine four ";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int number = ch - 'A' + 1;
            System.out.print(number + " ");
        }
    }
}


class NumberToName {

    public static void convert(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            char ch = (char) ('A' + num - 1);
            System.out.print(ch);
        }
    }
}

