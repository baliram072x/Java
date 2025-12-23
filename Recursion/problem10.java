public class problem10 {
    public static void printBinStrings(int n , int lastplace , String Str) {
        // // kaam 
        // if (lastplace == 0) {
        //     // sit 0 on chair n 
        //     printBinStrings(n-1, 0, Str.append("0"));
        //     printBinStrings(n-1, 1, Str.append("1"));
            
        // }else
        // {
        //     printBinStrings(n-1 , 0, Str.append("0"));
        // }

        //base case
        if (n==0 ) {
            System.out.println(Str);
            return;
        }

        printBinStrings(n-1 , 0 , Str+"0");
        if (lastplace == 0) {
            printBinStrings(n-1, 1, Str+"1");
        }
                      
    }
    public static void main(String[] args) {
        printBinStrings(3, 0, " ");
    }
    
}


//  print all binary strings of size N without consecutuve one